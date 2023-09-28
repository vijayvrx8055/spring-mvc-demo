package com.vrx.SpringMvcProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class About {

    @RequestMapping("/about")
    public String getAboutDetails(){
        System.out.println("Processing about Page");
        return "about";
    }
}
