package com.example.Swiggy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Payment {

    @Id
    //hi this the conflict
    public int paymentId;
    public int amount;
    public String paymentMode;
}
