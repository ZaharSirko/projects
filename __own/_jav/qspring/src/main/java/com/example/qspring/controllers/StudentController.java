package com.example.qspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("student")
    public String studentMain(){
      return "student";
    }
}
