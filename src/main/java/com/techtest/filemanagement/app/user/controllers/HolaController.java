package com.techtest.filemanagement.app.user.controllers;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HolaController {

    @GetMapping("/")    
    public Map<String,String> foo(){
        Map<String,String> json = new HashMap<>();
        json.put("message", "auxilio");
        return json;

    }
    
}
