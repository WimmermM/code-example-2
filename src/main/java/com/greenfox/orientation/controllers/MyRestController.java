package com.greenfox.orientation.controllers;


import com.greenfox.orientation.model.Attractions;
import com.greenfox.orientation.model.ListOfAttractions;
import com.greenfox.orientation.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyRestController {

    MyRepository myRepository;

    @Autowired
    public MyRestController(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @GetMapping("/budget")
    public ListOfAttractions returnCheapest(){

        return new ListOfAttractions(myRepository.myORderedlist());
    }

}
