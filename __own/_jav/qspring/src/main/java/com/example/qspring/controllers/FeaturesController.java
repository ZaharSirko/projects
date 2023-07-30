package com.example.qspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeaturesController {
    @GetMapping("/features")
    public String featuresMain(){
      return "features";
    }
}
