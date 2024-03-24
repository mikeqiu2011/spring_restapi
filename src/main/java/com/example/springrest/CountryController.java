package com.example.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @GetMapping("/france")
    public Country france(){
        var france = new Country("france", 67);
        return france;
    }

    @GetMapping("/all")
    public List<Country> all(){
        var france = new Country("france", 67);
        var spain = new Country("spain", 47);
        return List.of(france, spain);
    }
}
