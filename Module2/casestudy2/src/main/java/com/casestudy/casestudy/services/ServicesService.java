package com.casestudy.casestudy.services;

import com.casestudy.casestudy.entity.FuramaService;

import java.util.Optional;

public interface ServicesService {
    public Iterable<FuramaService> getAllService();
    public Optional<FuramaService> getService(Long idService);
    public void saveService(FuramaService Service);
    public void deleteService(Long idService);
}
