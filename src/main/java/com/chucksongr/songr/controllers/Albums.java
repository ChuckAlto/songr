package com.chucksongr.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/album")
public class Albums {
//    @GetMapping("/")
//    public String test() {
//        return "album";
//    }

    @GetMapping("/album/{name}")
    public String albumModel(@PathVariable String name, Model modelVar) {
        MyModel myModel = new MyModel();
        myModel.title = "title";
        myModel.artist = "artist";
        myModel.songCount = 9;
        myModel.albumLengthSeconds = 987;

        modelVar.addAttribute("myModel", myModel);
        // not a string of model but a template, this his how thymeleaf knows where to reroute
        return "album";
    }
}