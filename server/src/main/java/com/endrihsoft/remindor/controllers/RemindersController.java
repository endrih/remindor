package com.endrihsoft.remindor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reminders")
public class RemindersController {
    
    @GetMapping()
    public String getReminders(){
        return "Hello";
    }
}
