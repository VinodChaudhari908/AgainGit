package com.json.JsonHandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class health{

    @GetMapping
    public String check(){
        return "hi folks !!";
    }
}