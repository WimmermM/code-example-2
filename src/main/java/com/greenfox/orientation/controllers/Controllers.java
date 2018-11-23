package com.greenfox.orientation.controllers;


import com.greenfox.orientation.model.Attractions;
import com.greenfox.orientation.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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


    @GetMapping("/edit/{id}")
    public String editAttraction(@PathVariable("id")Integer id,Model model){

        if (myRepository.findAllById(id) == null){

            return "index";
        }

        model.addAttribute("listAll",myRepository.findAll());
        model.addAttribute("update","yes");
        model.addAttribute("oldName",myRepository.findAllById(id).getAttrName());
        model.addAttribute("oldCity",myRepository.findAllById(id).getCity());
        model.addAttribute("oldCategory",myRepository.findAllById(id).getCategory());
        model.addAttribute("oldPrice",myRepository.findAllById(id).getPrice());
        model.addAttribute("oldLongitude",myRepository.findAllById(id).getLongitude());
        model.addAttribute("oldLatitude",myRepository.findAllById(id).getLatitude());
        model.addAttribute("oldRecommendedAge",myRepository.findAllById(id).getRecommendedAge());
        model.addAttribute("oldDuration",myRepository.findAllById(id).getDuration());

        return "index";
    }

}
