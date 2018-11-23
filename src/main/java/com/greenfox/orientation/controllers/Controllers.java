package com.greenfox.orientation.controllers;


import com.greenfox.orientation.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

    @Autowired
    MyRepository myRepository;


    @GetMapping("/")
    public String listMainPage(){

        return "index";
    }

}
