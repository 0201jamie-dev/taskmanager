package de.jamieaugustin.taskmanager.services;

import de.jamieaugustin.taskmanager.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

  void createUser(User user);

  Optional<User> getUserById(long id);

  List<User> getUsers();

  void deleteUserById(long id);
}
