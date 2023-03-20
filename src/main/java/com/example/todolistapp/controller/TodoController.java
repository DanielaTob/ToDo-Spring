package com.example.todolistapp.controller;


import com.example.todolistapp.model.TodoItems;
import com.example.todolistapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping
    public List<TodoItems> findAll(){
        return todoRepository.findAll();
    }

    @PostMapping
    public TodoItems save(@Validated @NonNull @RequestBody TodoItems todoItems){
        return todoRepository.save(todoItems);
    }

    @PutMapping
    public TodoItems update(@Validated @NonNull @RequestBody TodoItems todoItems){
        return todoRepository.save(todoItems);
    }


    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todoRepository.deleteById(id);
    }
}

