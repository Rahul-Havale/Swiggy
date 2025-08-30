package com.example.Swiggy.service;

import com.example.Swiggy.model.Restaurant;
import com.example.Swiggy.repositories.SwiggyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SwiggyService {

    @Autowired
    private SwiggyRepository swiggyRepository;

    public ResponseEntity<Restaurant> createSwiggyData(Restaurant restaurant) {
        Restaurant response =  swiggyRepository.save(restaurant);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public List<Restaurant> getAllData() {
        return swiggyRepository.findAll();
    }

    public Restaurant getById(int id) {
        return swiggyRepository.findById(id).orElseThrow(()-> new RuntimeException("Id doesnt exist " + id));
    }
}
