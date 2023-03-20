package com.example.todolistapp.repository;

import com.example.todolistapp.model.TodoItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoItems, Long> {


}
