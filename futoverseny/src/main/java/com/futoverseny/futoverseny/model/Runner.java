package com.futoverseny.futoverseny.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Runner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "Adja meg a nevét.")
    @Size(min = 2, max = 50, message = "A név minimum2 és maximum 50 karakterből állhat.")
    private String name;
    
    @Min(value = 0, message = "Valós életkort adjon meg.")
    private int age;
    
    @NotNull(message = "Adja meg a nemét")
    @Size(min = 4, max = 6, message = "Válasszon: 'Férfi' vagy 'Nő'")
    private String gender;

    public Runner() {
    }

    public Runner(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

