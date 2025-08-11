package com.example.todo_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    //     // Spring Data JPA automatically provides methods like findAll(), save(), deleteById(), etc.
}
