package com.customermanamentrestful.demo.controller;

import com.customermanamentrestful.demo.entities.Customer;
import com.customermanamentrestful.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "/customers/", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> listAllCustomer() {
        List<Customer> customers = customerRepository.findAll();
        if (customers.isEmpty()) {
            return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") int id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer == null) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @RequestMapping(value = "/customers/", method = RequestMethod.POST)
    public ResponseEntity<Void> createCustomer(@RequestBody Customer customer, UriComponentsBuilder ucBuilder) {
        customerRepository.save(customer);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/customers/{id}").buildAndExpand(customer.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer) {
        Customer currentCustomer = customerRepository.findById(id).orElse(null);
        if (currentCustomer == null) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        currentCustomer.setFirstName(customer.getFirstName());
        currentCustomer.setLastName(customer.getLastName());
        currentCustomer.setId(customer.getId());
        customerRepository.save(currentCustomer);
        return new ResponseEntity<Customer>(currentCustomer, HttpStatus.OK);
    }
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting Customer with id " + id);

        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer == null) {
            System.out.println("Unable to delete. Customer with id " + id + " not found");
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }

        customerRepository.deleteById(id);
        return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
    }
}
