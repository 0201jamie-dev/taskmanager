package de.jamieaugustin.taskmanager.controller;

import de.jamieaugustin.taskmanager.services.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import de.jamieaugustin.taskmanager.model.Task;

import javax.validation.Valid;

@Controller
public class AddTaskController {
    @Autowired
    TaskServiceImpl taskServiceImpl;

    @GetMapping("/addTask")
    public String displayAddTaskPage(Model model) {
        model.addAttribute("task", new Task());
        return ("addtask");
    }

    @PostMapping("/addTask")
    public String addTask(@Valid @ModelAttribute("task") Task task, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/addTask";
        }
        taskServiceImpl.createTask(task);
        return ("redirect:/");
    }
}
