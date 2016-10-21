package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Armando on 10/21/2016.
 */
@Controller
public class IndexController {
    //By Convention, we return "index" and the Thymeleaf template of the name index is rendered
    //We dont have to say .html, the html is implied.
    //@RequestMapping tells Spring where we want this view mapped.
    @RequestMapping("/")
    public String Index(){
        return "index";
    }
}
