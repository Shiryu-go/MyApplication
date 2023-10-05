package com.example.demo.Controller;

import com.example.demo.Record.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public Message get(){
        return new Message("Hello");
    }
}

