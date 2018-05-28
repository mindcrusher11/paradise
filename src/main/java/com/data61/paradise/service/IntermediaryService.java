package com.data61.paradise.service;

import com.data61.paradise.models.Address;
import com.data61.paradise.models.Entity;
import com.data61.paradise.models.Intermediary;
import com.data61.paradise.repositories.IntermediaryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Service
public class IntermediaryService {

    private final static Logger LOG = LoggerFactory.getLogger(IntermediaryService.class);

    private final IntermediaryRepository intermediaryRepository;

    public IntermediaryService(IntermediaryRepository intermediaryRepository){
        this.intermediaryRepository = intermediaryRepository;
    }

    @Transactional(readOnly = true)
    public Intermediary findByName(String name) {
        Intermediary result = intermediaryRepository.findByName(name);
        return result;
    }

    @Transactional(readOnly = true)
    public Collection<Intermediary> getAllIntermediary(int limit){
        return intermediaryRepository.getIntermediaries(limit);
    }
}
