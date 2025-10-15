package com.tasks.what_shall_we_do;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TasksController {

    @GetMapping
    public List<Task> getTasks() {
        return Arrays.asList(
                new Task("1", "заголовок", "описание"));
    }

}
