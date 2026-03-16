package de.jamieaugustin.taskmanager.services;

import de.jamieaugustin.taskmanager.model.User;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for user management operations.
 *
 * @author Jamie Michael Augustin
 */
public interface UserService {

  void createUser(User user);

  /**
   * Returns the user with the given ID, or an empty {@link Optional} if none exists.
   */
  Optional<User> getUserById(long id);

  List<User> getUsers();

  void deleteUserById(long id);
}
