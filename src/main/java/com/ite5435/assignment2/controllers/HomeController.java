/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ite5435.assignment2.controllers;

import java.util.Date;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Austin
 */
@Controller
public class HomeController {
    
    @GetMapping("/")
    public ModelAndView index(){
        
        ModelAndView model = new ModelAndView();
        
        model.setViewName("index");
            
        return model;
    }
}
