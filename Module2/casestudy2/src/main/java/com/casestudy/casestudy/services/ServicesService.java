package com.casestudy.casestudy.services;

import com.casestudy.casestudy.entity.FuramaService;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public interface ServicesService {
    public List<FuramaService> getAllService();
    public Optional<FuramaService> getService(Long idService);
    public void saveService(FuramaService service);
    public void deleteService(Long idService);
    public Iterable<FuramaService> findAllByRentCostBetween(Integer fromPrice ,Integer toPrice);
}
