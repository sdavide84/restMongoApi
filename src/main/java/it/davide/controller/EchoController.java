package it.davide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
	
	@GetMapping("/echo/{name}")
    public String echo(@PathVariable String name, @RequestParam String p1) {
        return "Hello " + name + " - " + p1;
    }

}
