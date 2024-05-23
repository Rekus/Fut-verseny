package com.futoverseny.futoverseny.controller;

import com.futoverseny.futoverseny.model.Runner;
import com.futoverseny.futoverseny.repository.RunnerRepository;
import com.futoverseny.futoverseny.service.RunnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/runners")
public class RunnerController {

    @Autowired
    private RunnerRepository runnerRepository;

    @GetMapping
    public List<Runner> getAllRunners() {
        return runnerRepository.getAllRunners();
    }

    @PostMapping
    public Runner addRunner(@Valid @RequestBody Runner runner) {
        return runnerRepository.addRunner(runner);
    }
}

