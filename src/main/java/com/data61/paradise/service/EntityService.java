package com.data61.paradise.service;

import com.data61.paradise.models.Address;
import com.data61.paradise.models.Entity;
import com.data61.paradise.repositories.EntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EntityService {

    private final static Logger LOG = LoggerFactory.getLogger(EntityService.class);

    private final EntityRepository entityRepository;

    public EntityService(EntityRepository entityRepository){
        this.entityRepository = entityRepository;
    }

    @Transactional(readOnly = true)
    public Entity findByName(String name) {
        Entity result = entityRepository.findByName(name);
        return result;
    }
}
