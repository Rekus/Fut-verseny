package com.futoverseny.futoverseny.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "Adja meg a nevét!")
    @Size(min = 2, max = 100, message = "Adjonmeg valós nevet. A felhasználható karakterek számának 2 és 100 köze kell esnie.")
    private String name;
    
    @Min(value = 0, message = "Adjon meg valós távot.")
    private double distance;

    public Race() {
    }

    public Race(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}

