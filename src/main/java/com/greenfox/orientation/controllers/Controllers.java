package com.greenfox.orientation.controllers;


import com.greenfox.orientation.model.Attractions;
import com.greenfox.orientation.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllers {

    @Autowired
    MyRepository myRepository;


    @GetMapping("/")
    public String listMainPage(Model model){
        model.addAttribute("listAll",myRepository.findAll());

        return "index";
    }


    @PostMapping("/add")
    public String addAttraction(@RequestParam("attrName")String attrName,
                                @RequestParam("city")String city,
                                @RequestParam("category")String category,
                                @RequestParam("price")Integer price,
                                @RequestParam("longitude")Float longitude,
                                @RequestParam("latitude")Float latitude,
                                @RequestParam("recommendedAge")Float recommendedAge,
                                @RequestParam("duration")Integer duration){

        myRepository.save(new Attractions(attrName,city,category,price,longitude,latitude,recommendedAge,duration));



        return "redirect:/";
    }

}
