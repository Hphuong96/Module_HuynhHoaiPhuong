package com.casestudy.casestudy.services.serviceImpl;

import com.casestudy.casestudy.entity.FuramaService;
import com.casestudy.casestudy.repository.ServiceRepository;
import com.casestudy.casestudy.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements ServicesService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public List<FuramaService> getAllService() {
        return serviceRepository.findAll();
    }

    @Override
    public Optional<FuramaService> getService(Long idService) {
        return serviceRepository.findById(idService);
    }

    @Override
    public void saveService(FuramaService service) {
        serviceRepository.save(service);
    }

    @Override
    public void deleteService(Long idService) {
        serviceRepository.deleteById(idService);
    }

    @Override
    public Iterable<FuramaService> findAllByRentCostBetween(Integer fromPrice, Integer toPrice) {
        return serviceRepository.findAllByRentCostBetween(fromPrice, toPrice);
    }
}
