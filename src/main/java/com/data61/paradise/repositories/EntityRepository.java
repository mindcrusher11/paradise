package com.data61.paradise.repositories;


import com.data61.paradise.models.Entity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface EntityRepository extends Neo4jRepository<Entity, Long> {

    Entity findByName(@Param("name") String name);

/*    @Query("MATCH (m:Movie)<-[r:ACTED_IN]-(a:Person) RETURN m,r,a LIMIT {limit}")
    Collection<Movie> graph(@Param("limit") int limit);*/
}
