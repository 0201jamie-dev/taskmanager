package de.jamieaugustin.taskmanager.controller;

import de.jamieaugustin.taskmanager.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String displayIndexPage(Model model) {
        model.addAttribute("tasks");

        return "index";
    }
}
