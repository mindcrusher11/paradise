package com.data61.paradise.repositories;


import com.data61.paradise.models.Address;
import com.data61.paradise.models.Officer;
import org.neo4j.driver.v1.types.Path;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Map;

public interface OfficerRepository  extends Neo4jRepository<Officer, Long> {

    Officer findByName(@Param("name") String name);

    @Query("MATCH p=allShortestPaths((rex:Officer)-[*]-(queen:Officer)) WHERE rex.node_id = {startNodeId} AND queen.node_id = {endNodeId} RETURN p")
    Iterable<Map<String,Path>> getShortestPath(@Param("startNodeId") String startNodeId, @Param("endNodeId") String endNodeId);


}
