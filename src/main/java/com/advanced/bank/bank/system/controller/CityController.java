package com.advanced.bank.bank.system.controller;

import com.advanced.bank.bank.system.model.City;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cities")
public class CityController {

    @PostMapping
    public void createCity(@RequestBody City city){

    }

    @PutMapping
    public void updateCity(@RequestBody City city){

    }

    @GetMapping
    public List<City> getCities(){
        return null;
    }

    @GetMapping("/{cityId}")
    public City getCity(@PathVariable Long cityId){
        return null;
    }

    @DeleteMapping("/{cityId}")
    public void deleteCity(@PathVariable Long cityId){

    }
}
