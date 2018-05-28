package com.data61.paradise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String handleRequest() {
        return "<html><body><h2>Welcome to Data61</h2><div>Paradise Data</div>"
                        + "<div>Data can be accessed using /entity,/address,/intermediary,/officer,/other </div><body></html>";
    }
}
