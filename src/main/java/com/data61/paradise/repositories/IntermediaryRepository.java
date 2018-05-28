package com.data61.paradise.repositories;

import com.data61.paradise.models.Entity;
import com.data61.paradise.models.Intermediary;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface IntermediaryRepository extends Neo4jRepository<Intermediary, Long> {

    Intermediary findByName(@Param("name") String name);

    @Query("MATCH p=()-[r:intermediary_of]->() RETURN p LIMIT {limit}")
    Collection<Intermediary> getIntermediaries(@Param("limit") int limit);

    Collection<Intermediary> getAllByEntities();
}
