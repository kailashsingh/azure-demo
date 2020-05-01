package com.azure.demo.azservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/getData")
    public String getData() {

        return "Getting Data for AzService - New Feature";
    }

}