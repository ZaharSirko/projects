package com.example.qspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MissedLessonController {
    @GetMapping("missed_lessons")
    public String groupMain(){
      return "missed_lessons";
    }
}
