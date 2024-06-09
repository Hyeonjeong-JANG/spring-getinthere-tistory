package com.example.getintheretistory;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/detail")
    public String detail(){

        return "detail";
    }
}
