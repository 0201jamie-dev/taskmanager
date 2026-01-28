package de.jamieaugustin.taskmanager.services;

import de.jamieaugustin.taskmanager.model.Task;
import de.jamieaugustin.taskmanager.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public void createTask(Task task) {
        taskRepository.saveAndFlush(task);
    }
}
