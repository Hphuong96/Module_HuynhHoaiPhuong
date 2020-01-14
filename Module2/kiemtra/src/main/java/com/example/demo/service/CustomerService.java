package com.example.demo.service;

import com.example.demo.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    public Page<Customer> getAllCustomer(Pageable pageable);
    public Optional<Customer> getCustomer(Long idCustomer);
    public void saveCustomer(Customer customer);
    public void deleteCustomer(Long idCustomer);
    public Iterable<Customer> findAllByNameContaining(String name,Pageable pageable);
}
