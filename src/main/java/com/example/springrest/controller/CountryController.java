package com.example.springrest.controller;

import com.example.springrest.domain.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        var france = new Country("france", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .body(france);
    }

    @GetMapping("/all")
    public List<Country> all(){
        var france = new Country("france", 67);
        var spain = new Country("spain", 47);
        return List.of(france, spain);
    }
}
