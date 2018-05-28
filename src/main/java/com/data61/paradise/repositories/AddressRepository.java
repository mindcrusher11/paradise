package com.data61.paradise.repositories;


import com.data61.paradise.models.Address;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface AddressRepository extends Neo4jRepository<Address, Long> {

    Address findByName(@Param("name") String name);
}
