package com.example.Swiggy.repositories;

import com.example.Swiggy.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwiggyRepository extends JpaRepository<Restaurant, Integer> {
}