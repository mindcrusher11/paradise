package com.data61.paradise.controller;

import com.data61.paradise.models.Other;
import com.data61.paradise.service.OtherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/other")
public class OtherController {

    private OtherService otherService;

    public OtherController(OtherService otherService){
        this.otherService = otherService;
    }

    @GetMapping("/byname")
    public Other findByName(@RequestParam String title) {
        return otherService.findByName(title);
    }
}
