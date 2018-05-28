package com.data61.paradise.controller;

import com.data61.paradise.models.Address;
import com.data61.paradise.models.Other;
import com.data61.paradise.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @GetMapping("/byname")
    public Address findByName(@RequestParam String title) {
        return addressService.findByName(title);
    }
}
