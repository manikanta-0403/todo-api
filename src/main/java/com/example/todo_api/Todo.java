package com.example.todo_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data; // Lombok annotation to generate getters, setters, etc.

@Entity
@Data // This is from Lombok!
public class Todo {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private boolean completed = false;
}