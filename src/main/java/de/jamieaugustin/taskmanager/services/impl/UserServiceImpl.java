package de.jamieaugustin.taskmanager.services.impl;

import de.jamieaugustin.taskmanager.model.User;
import de.jamieaugustin.taskmanager.repositories.UserRepository;
import de.jamieaugustin.taskmanager.services.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void createUser(User user) {
    userRepository.save(user);
  }

  @Override
  public Optional<User> getUserById(long id) {
    return userRepository.findById(id);
  }

  @Override
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  @Override
  public void deleteUserById(long id) {
    userRepository.deleteById(id);
  }
}
