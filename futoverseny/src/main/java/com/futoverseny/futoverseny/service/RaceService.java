package com.futoverseny.futoverseny.service;

import com.futoverseny.futoverseny.model.Race;
import com.futoverseny.futoverseny.repository.RaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceService {
    private final RaceRepository raceRepository;

    public RaceService(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    public List<Race> getAllRaces() {
        return raceRepository.findAll();
    }

    public Race addRace(Race race) {
        return raceRepository.save(race);
    }

    public Race updateRace(Long id, Race raceDetails) {
        Race race = raceRepository.findById(id).orElseThrow(() -> new RuntimeException("Race not found"));
        race.setName(raceDetails.getName());
        race.setDistance(raceDetails.getDistance());
        return raceRepository.save(race);
    }
}

