package com.futoverseny.futoverseny.controller;

import com.futoverseny.futoverseny.model.Race;
import com.futoverseny.futoverseny.model.Result;
import com.futoverseny.futoverseny.repository.RaceRepository;
import com.futoverseny.futoverseny.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;

@Controller
public class RaceThymeleafController {

    @Autowired
    private RaceRepository raceRepository;
    
    @Autowired
    private ResultRepository resultRepository;

    // Versenyek listázása
    @GetMapping("/")
    public String index(Model model) {
        List<Race> races = raceRepository.findAll();
        model.addAttribute("races", races);
        return "index";
    }

    // Verseny részleteinek megjelenítése
    @GetMapping("/race/{id}")
    public String raceDetails(@PathVariable Long id, Model model) {
        Race race = raceRepository.findById(id).orElseThrow(() -> new RuntimeException("Nincs ilyen verseny."));
        List<Result> results = resultRepository.findByRaceOrderByTimeAsc(race);
        model.addAttribute("race", race);
        model.addAttribute("results", results);
        return "race";
    }

    // Új verseny létrehozása form
    @GetMapping("/newRace")
    public String newRaceForm() {
        return "newRace";
    }

    // Új verseny hozzáadása
    @PostMapping("/addRace")
    public String addRace(@RequestParam String name, @RequestParam double distance) {
        Race race = new Race(name, distance);
        raceRepository.save(race);
        return "redirect:/";
    }
}

