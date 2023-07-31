package com.example.qspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.qspring.model.Group;
import com.example.qspring.repo.GroupRepository;

@Controller
public class GroupController {

@Autowired
private GroupRepository groupRepository;

    @GetMapping("/groups")
    public String groupMain(Model model){
      Iterable<Group> group = groupRepository.findAll();
     model.addAttribute("groups",group);
      return "groups";
    }
}
