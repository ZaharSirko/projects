package com.example.qspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class GroupController {
    @GetMapping("/groups")
    public String groupMain(){
      return "groups";
    }
}
