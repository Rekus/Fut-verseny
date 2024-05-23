package com.futoverseny.futoverseny.service;

import com.futoverseny.futoverseny.model.Runner;
import com.futoverseny.futoverseny.repository.RunnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunnerService {
    private final RunnerRepository runnerRepository;

    public RunnerService(RunnerRepository runnerRepository) {
        this.runnerRepository = runnerRepository;
    }

    public List<Runner> getAllRunners() {
        return runnerRepository.findAll();
    }

    public Runner addRunner(Runner runner) {
        return runnerRepository.save(runner);
    }
}

