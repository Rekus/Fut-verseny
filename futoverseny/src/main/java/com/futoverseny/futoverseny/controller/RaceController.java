package com.futoverseny.futoverseny.controller;

import com.futoverseny.futoverseny.model.Race;
import com.futoverseny.futoverseny.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/races")
public class RaceController {

    @Autowired
    private RaceService raceService;

    @GetMapping
    public List<Race> getAllRaces() {
        return raceService.getAllRaces();
    }

    @PostMapping
    public Race addRace(@RequestBody Race race) {
        return raceService.addRace(race);
    }

    @PutMapping("/{id}")
    public Race updateRace(@PathVariable Long id, @RequestBody Race race) {
        return raceService.updateRace(id, race);
    }
}

