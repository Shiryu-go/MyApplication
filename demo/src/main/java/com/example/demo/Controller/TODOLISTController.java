package com.example.demo.Controller;

import com.example.demo.Record.ListGroup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TODOLISTController {
    @GetMapping("/")
    public ListGroup GetAll(){
        return new ListGroup();
    }
}
