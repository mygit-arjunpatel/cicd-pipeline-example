package com.arjun.cicd.example.cicdpipeline.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/App")
public class Controller {

    @GetMapping(value = "/GetStatus", consumes = "application/json", produces = "application/json")
    public String GetStatus()
    {
        return "We are into the GetStatus Controller Get mapping";
    }
}
