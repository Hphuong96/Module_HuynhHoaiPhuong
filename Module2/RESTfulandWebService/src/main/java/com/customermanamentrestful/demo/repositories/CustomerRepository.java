package com.customermanamentrestful.demo.repositories;

import com.customermanamentrestful.demo.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
