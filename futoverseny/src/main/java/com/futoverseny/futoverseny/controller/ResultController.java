package com.futoverseny.futoverseny.controller;

import com.futoverseny.futoverseny.model.Result;
import com.futoverseny.futoverseny.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.futoverseny.futoverseny.repository.ResultRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/results")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @GetMapping("/race/{raceId}")
    public List<Result> getResultsByRaceId(@PathVariable Long raceId) {
        return resultService.getResultsByRaceId(raceId);
    }

    @PostMapping
    public Result addResult(@RequestBody Result result) {
        return resultService.addResult(result);
    }

    @GetMapping("/averageTime/{raceId}")
    public double getAverageTimeByRaceId(@PathVariable Long raceId) {
        return resultService.getAverageTimeByRaceId(raceId);
    }
}
