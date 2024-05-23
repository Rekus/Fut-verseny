package com.futoverseny.futoverseny.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull(message = "Adja meg az azonosítóját.")
    private Runner runner;

    @ManyToOne
    NotNull(message = "Valós versenyt adjon meg.")
    private Race race;

    @Min(value = 0, message = "Valós időt adjon meg.")
    private int time; // time in minutes

    public Result() {
    }

    public Result(Runner runner, Race race, int time) {
        this.runner = runner;
        this.race = race;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

