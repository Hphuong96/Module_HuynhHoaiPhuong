package com.casestudy.casestudy.services.serviceImpl;

import com.casestudy.casestudy.entity.FuramaContact;
import com.casestudy.casestudy.repository.ContactRepository;
import com.casestudy.casestudy.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactImpl implements ContactService {
    @Autowired
    ContactRepository contactRepository;

    @Override
    public List<FuramaContact> getAllContact() {
        return contactRepository.findAll();
    }

    @Override
    public Optional<FuramaContact> getContact(Long idContact) {
        return contactRepository.findById(idContact);
    }

    @Override
    public void saveContact(FuramaContact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void deleteContact(Long idContact) {
        contactRepository.deleteById(idContact);
    }

    @Override
    public Iterable<FuramaContact> findAllByIdCustomer(Long id) {
        return contactRepository.findAllByIdCustomer(id);
    }
}
