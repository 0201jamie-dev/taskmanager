package de.jamieaugustin.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import lombok.Data;

// TODO: Delete getters and setters and use Lombok instead
@Entity
@Data
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @NotBlank
  private String name;
  private String note;
  private boolean isFinished;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
}
