package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate manufacturing;
    private LocalDate expiry;
    private float price;
    private String category;

    // Empty constructor (required by JPA)
    public Item() {}

    // Parameterized constructor
    public Item(String name, LocalDate manufacturing, LocalDate expiry, float price, String category) {
        this.name = name;
        this.manufacturing = manufacturing;
        this.expiry = expiry;
        this.price = price;
        this.category = category;
    }

    // ✅ Getters and Setters (these are what getName() and setName() use)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getManufacturing() { return manufacturing; }
    public void setManufacturing(LocalDate manufacturing) { this.manufacturing = manufacturing; }

    public LocalDate getExpiry() { return expiry; }
    public void setExpiry(LocalDate expiry) { this.expiry = expiry; }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}