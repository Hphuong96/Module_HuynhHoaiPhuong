package com.casestudy.casestudy.services;

import com.casestudy.casestudy.entity.FuramaContact;
import com.casestudy.casestudy.entity.FuramaCustomer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    public List<FuramaCustomer> getAllCustomer();
    public Optional<FuramaCustomer> getCustomer(Long idCustomer);
    public void saveCustomer(FuramaCustomer customer);
    public void deleteCustomer(Long idCustomer);
}
