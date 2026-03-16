package de.jamieaugustin.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

/**
 * Represents a task entity persisted in the database.
 *
 * @author Jamie Michael Augustin
 */
// TODO: Delete getters and setters and use Lombok instead
@Entity
@Data
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;
  private String note;
  private boolean isFinished;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
}
