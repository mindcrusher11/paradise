package com.data61.paradise.service;

import com.data61.paradise.models.Address;
import com.data61.paradise.models.Officer;
import com.data61.paradise.models.Other;
import com.data61.paradise.repositories.OtherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OtherService {

    private final static Logger LOG = LoggerFactory.getLogger(OtherService.class);

    private final OtherRepository otherRepository;

    public OtherService(OtherRepository otherRepository){
        this.otherRepository = otherRepository;
    }

    @Transactional(readOnly = true)
    public Other findByName(String name) {
        Other result = otherRepository.findByName(name);
        return result;
    }
}
