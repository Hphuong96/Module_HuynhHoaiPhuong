package com.casestudy.casestudy.services;

import com.casestudy.casestudy.entity.FuramaContact;
import com.casestudy.casestudy.entity.FuramaService;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    public List<FuramaContact> getAllContact();
    public Optional<FuramaContact> getContact(Long idContact);
    public void saveContact(FuramaContact contact);
    public void deleteContact(Long idContact);
    Iterable<FuramaContact> findAllByIdCustomer(Long id);
}
