package com.casestudy.casestudy.repository;

import com.casestudy.casestudy.entity.FuramaContact;
import com.casestudy.casestudy.entity.FuramaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends JpaRepository<FuramaContact,Long> {
    Iterable<FuramaContact> findAllByIdCustomer(Long id);
}
