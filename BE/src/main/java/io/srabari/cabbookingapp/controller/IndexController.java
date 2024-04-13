package io.srabari.cabbookingapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/home")
    public ResponseEntity<?> getHome() {
        return ResponseEntity.ok("Home Page");
    }

}
