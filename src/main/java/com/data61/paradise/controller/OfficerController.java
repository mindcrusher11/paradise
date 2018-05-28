package com.data61.paradise.controller;

import com.data61.paradise.models.Address;
import com.data61.paradise.models.Officer;
import com.data61.paradise.models.Other;
import com.data61.paradise.service.OfficerService;
import org.neo4j.driver.v1.types.Path;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/officer")
public class OfficerController {

    private final OfficerService officerService;

    public  OfficerController(OfficerService officerService){
        this.officerService = officerService;
    }


    @GetMapping("/byName")
    public Officer findByName(@RequestParam String title) {
        return officerService.findByName(title);
    }

    @GetMapping("/shortestPath")
    public String getShortestPath(@RequestParam String startNodeId, @RequestParam String endNodeId){
        Iterable<Map<String, Path>> shortestPath = officerService.getShortestPath(startNodeId, endNodeId);
        Path path = shortestPath.iterator().next().get("p");
        return path.toString();
    }
}
