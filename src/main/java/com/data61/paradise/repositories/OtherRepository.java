package com.data61.paradise.repositories;

import com.data61.paradise.models.Address;
import com.data61.paradise.models.Officer;
import com.data61.paradise.models.Other;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface OtherRepository extends Neo4jRepository<Other, Long> {

    Other findByName(@Param("name") String name);
}
