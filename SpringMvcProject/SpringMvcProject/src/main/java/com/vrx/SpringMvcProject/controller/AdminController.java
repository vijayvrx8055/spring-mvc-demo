package com.vrx.SpringMvcProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/login")
    public String getLoginPageHandler(){
        return "login";
    }
}
