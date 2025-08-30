package com.example.Swiggy.controller;

import com.example.Swiggy.model.Restaurant;
import com.example.Swiggy.service.SwiggyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/controller")
public class SwiggyController {

    @Autowired
    private SwiggyService service;


    //http://localhost:8082/api/controller/create
    @PostMapping("/create")
    public ResponseEntity<Restaurant> createSwiggyData(
            @RequestBody Restaurant restaurant
            ){
        return service.createSwiggyData(restaurant);
    }

    //http://localhost:8082/api/controller/getAll
    @GetMapping("/getAll")
    public List<Restaurant> getAllData(){
        return service.getAllData();
    }

    //http://localhost:8082/api/controller/getById
    @GetMapping("/getById")
    public Restaurant getById(
            @RequestParam int id
    ){
        return service.getById(id);
    }

}
