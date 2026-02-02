package de.jamieaugustin.taskmanager.controller;

import de.jamieaugustin.taskmanager.model.Task;
import de.jamieaugustin.taskmanager.services.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EditTaskController {
    @Autowired
    TaskServiceImpl taskServiceImpl;

    @GetMapping("task/{id}")
    public String displayEditTaskPage(@PathVariable("id") long id, Model model) {
        Task task = taskServiceImpl.getTaskById(id);
        model.addAttribute("task", task);

        return "edittask";
    }
}
