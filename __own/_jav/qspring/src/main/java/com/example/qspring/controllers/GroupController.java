package com.example.qspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.qspring.model.Group;
import com.example.qspring.repo.GroupRepository;

import jakarta.validation.Valid;

@Controller
public class GroupController {

    @Autowired
    private GroupRepository groupRepository;

    @GetMapping("/groups")
    public String groupMain(Model model) {
        Iterable<Group> groups = groupRepository.findAll();
        model.addAttribute("groups", groups);
        return "groups";
    }

    @PostMapping("/groups")
    public String groupPostsAdd(@RequestParam String name) {
        Group group = new Group(name);
        groupRepository.save(group);
        return "redirect:/groups";
    }

    @GetMapping("/groups/add")
    public String groupAdd(Model model) {
        return "groups-add";
    }

    @PostMapping("/groups/add")
    public String groupPostAdd(@Valid @ModelAttribute Group group, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "groups-add";
        }
        groupRepository.save(group);
        return "redirect:/groups";
    }
}

