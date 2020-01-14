package com.casestudy.casestudy.repository;

import com.casestudy.casestudy.entity.FuramaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ServiceRepository extends JpaRepository<FuramaService,Long> {
    Iterable<FuramaService> findAllByRentCostBetween(Integer fromPrice ,Integer toPrice);
}
