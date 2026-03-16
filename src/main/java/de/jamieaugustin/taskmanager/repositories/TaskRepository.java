package de.jamieaugustin.taskmanager.repositories;

import de.jamieaugustin.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for {@link de.jamieaugustin.taskmanager.model.Task} entities.
 *
 * @author Jamie Michael Augustin
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
