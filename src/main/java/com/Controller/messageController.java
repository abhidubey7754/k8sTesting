package com.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class messageController {

    @GetMapping
    public String getMessage(){
        return "this message is for testing purpose!!don't reply.. ";
    }
}
