package com.example.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @GetMapping("/france")
    public Country france(){
        var france = new Country("france", 67);
        return france;
    }
}
