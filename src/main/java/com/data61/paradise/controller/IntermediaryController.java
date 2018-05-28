package com.data61.paradise.controller;


import com.data61.paradise.models.Address;
import com.data61.paradise.models.Entity;
import com.data61.paradise.models.Intermediary;
import com.data61.paradise.service.IntermediaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/intermediary")
public class IntermediaryController {

    private final IntermediaryService intermediaryService;

    public IntermediaryController(IntermediaryService intermediaryService){
        this.intermediaryService = intermediaryService;
    }


    @GetMapping("/byname")
    public Intermediary findByName(@RequestParam String title) {
        return intermediaryService.findByName(title);
    }

    @GetMapping("/ofentity")
    public Collection<Intermediary> getAllIntermediary(int limit) {
        return intermediaryService.getAllIntermediary(limit);
    }
}
