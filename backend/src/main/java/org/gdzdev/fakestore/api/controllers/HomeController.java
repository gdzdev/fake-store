package org.gdzdev.fakestore.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping({"", "/", "/home"})
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Backend is running...");
    }
}
