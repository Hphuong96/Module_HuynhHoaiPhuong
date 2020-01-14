package com.casestudy.casestudy.services.serviceImpl;

import com.casestudy.casestudy.entity.FuramaCustomer;
import com.casestudy.casestudy.repository.CustomerRepository;
import com.casestudy.casestudy.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<FuramaCustomer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<FuramaCustomer> getCustomer(Long idCustomer) {
        return customerRepository.findById(idCustomer);
    }

    @Override
    public void saveCustomer(FuramaCustomer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long idCustomer) {
        customerRepository.deleteById(idCustomer);
    }
}
