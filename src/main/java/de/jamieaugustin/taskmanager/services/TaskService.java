package de.jamieaugustin.taskmanager.services;

import de.jamieaugustin.taskmanager.model.Task;

public interface TaskService {
    void createTask(Task task);

    Task getTaskById(long id);
}
