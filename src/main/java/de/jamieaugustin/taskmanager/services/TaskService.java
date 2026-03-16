package de.jamieaugustin.taskmanager.services;

import de.jamieaugustin.taskmanager.model.Task;

import java.util.List;

/**
 * Service interface for task management operations.
 *
 * @author Jamie Michael Augustin
 */
public interface TaskService {

  void createTask(Task task);

  /**
   * Returns the task with the given ID, or {@code null} if no task exists with that ID.
   */
  Task getTaskById(long id);

  List<Task> getTasks();

  void deleteTaskById(long id);
}
