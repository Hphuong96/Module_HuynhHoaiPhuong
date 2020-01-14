package com.exam.exam.service.CustomerImpl;

import com.exam.exam.entity.Customer;
import com.exam.exam.repository.CustomerRepository;
import com.exam.exam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<Customer> getAllCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Optional<Customer> getCustomer(Long idCustomer) {
        return customerRepository.findById(idCustomer);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long idCustomer) {
        customerRepository.deleteById(idCustomer);
    }

    @Override
    public Page<Customer> findAllByNameContaining(String name,Pageable pageable) {
        return customerRepository.findAllByNameContaining(name,pageable);
    }
}
