package com.agung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Agung Setiawan
 */
@Controller
@RequestMapping
public class HomeController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    
    @RequestMapping(value = "halo",method = RequestMethod.GET)
    public String halo(){
        return "halo";
    }
}
