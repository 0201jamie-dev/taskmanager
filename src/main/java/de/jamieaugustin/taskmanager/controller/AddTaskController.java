package de.jamieaugustin.taskmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import de.jamieaugustin.taskmanager.model.Task;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AddTaskController {
    @GetMapping("/addPerson")
    public String loadAddTaskPage(Model model) {
        return ("addtask");
    }

    @PostMapping("/addPerson")
    public String addTask(@RequestBody Task task) {
        return ("addtask");
    }
}
