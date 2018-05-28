package com.data61.paradise.controller;

import com.data61.paradise.models.Entity;
import com.data61.paradise.models.Other;
import com.data61.paradise.service.EntityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entity")
public class EntityController {

    private EntityService entityService;

    public EntityController(EntityService entityService){
        this.entityService = entityService;
    }

    @GetMapping("/byname")
    public Entity findByName(@RequestParam String title) {
        return entityService.findByName(title);
    }

}
