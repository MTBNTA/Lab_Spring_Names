package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping()
    public Greeting greeting(@RequestParam(defaultValue = "00:00") String timeOfDay) {
        return new Greeting("Jane", timeOfDay);
    }

    @GetMapping(value = "/summer")
    public Celebration celebration() {
        return new Celebration("Happy summer solstice!");
    }

}
