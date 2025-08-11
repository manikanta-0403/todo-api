package com.example.todo_api;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
// IMPORTANT: This allows requests from our Angular app during local development
@CrossOrigin(origins = {"http://localhost:4200", "https://6899b4de3f756d8176713fdc--legendary-beignet-0100c1.netlify.app"})
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        // We set the ID to null to ensure it's a new entity
        return todoRepository.save(todo);
    }
}