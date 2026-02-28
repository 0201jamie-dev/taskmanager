package de.jamieaugustin.taskmanager.services;

import de.jamieaugustin.taskmanager.model.Task;

import java.util.List;

public interface TaskService {
    void createTask(Task task);
    Task getTaskById(long id);
    List<Task> getTasks();
    void deleteTaskById(long id);
}
