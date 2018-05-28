package com.data61.paradise.service;

import com.data61.paradise.models.Address;
import com.data61.paradise.repositories.AddressRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {

    private final static Logger LOG = LoggerFactory.getLogger(AddressService.class);

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    @Transactional(readOnly = true)
    public Address findByName(String name) {
        Address result = addressRepository.findByName(name);
        return result;
    }

}
