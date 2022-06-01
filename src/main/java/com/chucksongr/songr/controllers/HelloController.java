package com.chucksongr.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloController {
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    @ResponseBody
//    public String getTest(){
//        return "Hello World!";
//    }

// use this way of writing it, not the way above this.
    @GetMapping("/hi")

    public String getHi(){
        return "hello";
    }

    // route with params
    @GetMapping("/capitalize/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        String upperCaseName = name.toUpperCase(Locale.ROOT);
        return upperCaseName;
    }

    // route with params using model through the thymeleaf template
//    @GetMapping("/model/{name}")
//    public String modelMe(@PathVariable String name, Model model){
//        MyModel myModel = new MyModel();
//        myModel.name = name;
//        myModel.number = 4;
//
//        model.addAttribute("myModel", myModel);
//        // not a string of model but a template, this his how thymeleaf knows where to reroute
//        return "model";
//    }
}
