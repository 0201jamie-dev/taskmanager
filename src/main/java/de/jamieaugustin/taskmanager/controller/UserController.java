package de.jamieaugustin.taskmanager.controller;

import de.jamieaugustin.taskmanager.model.User;
import de.jamieaugustin.taskmanager.services.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller exposing user CRUD endpoints under {@code /api}.
 *
 * @author Jamie Michael Augustin
 */
@RestController
@RequestMapping("/api")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/user/{id}")
  public Optional<User> getUserById(@PathVariable("id") User user) {
    return Optional.ofNullable(user);
  }

  @GetMapping("/users")
  public List<User> getUsers() {
    return userService.getUsers();
  }

  @PostMapping("/user")
  public void createUser(@RequestBody User user) {
    userService.createUser(user);
  }

  @DeleteMapping("/user/{id}")
  public void deleteUserById(@PathVariable long id) {
    userService.deleteUserById(id);
  }
}
