package com.data61.paradise.service;

import com.data61.paradise.models.Address;
import com.data61.paradise.models.Officer;
import com.data61.paradise.repositories.OfficerRepository;
import org.neo4j.driver.v1.types.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Map;

@Service
public class OfficerService {

    private final static Logger LOG = LoggerFactory.getLogger(OfficerService.class);

    public final OfficerRepository officerRepository;

    public OfficerService(OfficerRepository officerRepository){
        this.officerRepository = officerRepository;
    }

    @Transactional(readOnly = true)
    public Officer findByName(String name) {
        Officer result = officerRepository.findByName(name);
        return result;
    }

    @Transactional(readOnly = true)
    public Iterable<Map<String, Path>> getShortestPath(String startNodeId , String endNodeId){
        Iterable<Map<String, Path>> shortestPath = officerRepository.getShortestPath(startNodeId, endNodeId);
        return shortestPath;
    }

}
