package com.vrx.SpringMvcProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value = "/details",method = RequestMethod.GET)
    public String getApiDetails(){
        System.out.println("Api details Processing...");
        return "This will return the details about all APIs";
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<String> getAllUsers(){
        return Arrays.asList("Vijay","Binod","Ajay");
    }

    @RequestMapping(value = "/createUser",method = RequestMethod.POST)
    public String createUser(){
        return "User created successfully!!";
    }
}
