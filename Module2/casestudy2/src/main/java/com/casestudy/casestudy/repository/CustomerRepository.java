package com.casestudy.casestudy.repository;

import com.casestudy.casestudy.entity.FuramaContact;
import com.casestudy.casestudy.entity.FuramaCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<FuramaCustomer,Long> {

}
