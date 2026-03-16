package de.jamieaugustin.taskmanager.controller;

import de.jamieaugustin.taskmanager.model.Task;
import de.jamieaugustin.taskmanager.services.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller exposing task CRUD endpoints under {@code /api}.
 *
 * @author Jamie Michael Augustin
 */
@RestController
@RequestMapping("/api")
public class TaskController {

  private final TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }

  @PostMapping("/task")
  public void createTask(@RequestBody Task task) {
    taskService.createTask(task);
  }

  @GetMapping("/task/{id}")
  public Task getTaskById(@PathVariable long id) {
    return taskService.getTaskById(id);
  }

  @GetMapping("/tasks")
  public List<Task> getTasks() {
    return taskService.getTasks();
  }

  @DeleteMapping("/task/{id}")
  public void deleteTaskById(@PathVariable long id) {
    taskService.deleteTaskById(id);
  }
}
