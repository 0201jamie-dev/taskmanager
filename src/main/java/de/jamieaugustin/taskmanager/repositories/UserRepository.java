package de.jamieaugustin.taskmanager.repositories;

import de.jamieaugustin.taskmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
