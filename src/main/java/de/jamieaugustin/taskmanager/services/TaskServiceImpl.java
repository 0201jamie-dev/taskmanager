package de.jamieaugustin.taskmanager.services;

import de.jamieaugustin.taskmanager.model.Task;
import de.jamieaugustin.taskmanager.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;

    @Override
    public void createTask(Task task) {
        taskRepository.saveAndFlush(task);
    }

    @Override
    public Task getTaskById(long id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.orElse(null);
    }
}
