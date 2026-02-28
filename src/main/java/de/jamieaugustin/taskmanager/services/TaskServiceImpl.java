package de.jamieaugustin.taskmanager.services;

import de.jamieaugustin.taskmanager.model.Task;
import de.jamieaugustin.taskmanager.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void createTask(Task task) {
        taskRepository.saveAndFlush(task);
    }

    @Override
    public Task getTaskById(long id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.orElse(null);
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void deleteTaskById(long id) {
        taskRepository.deleteById(id);
    }
}
