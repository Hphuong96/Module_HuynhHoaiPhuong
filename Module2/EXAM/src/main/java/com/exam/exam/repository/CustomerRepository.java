package com.exam.exam.repository;

import com.exam.exam.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
   Page<Customer> findAllByNameContaining(String name, Pageable pageable);

}
