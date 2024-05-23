package com.futoverseny.futoverseny;

import com.futoverseny.futoverseny.model.Race;
import com.futoverseny.futoverseny.model.Result;
import com.futoverseny.futoverseny.model.Runner;
import com.futoverseny.futoverseny.repository.RaceRepository;
import com.futoverseny.futoverseny.repository.ResultRepository;
import com.futoverseny.futoverseny.repository.RunnerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class DataInitializer implements CommandLineRunner {
    private final RunnerRepository runnerRepository;
    private final RaceRepository raceRepository;
    private final ResultRepository resultRepository;

    public DataInitializer(RunnerRepository runnerRepository, RaceRepository raceRepository, ResultRepository resultRepository) {
        this.runnerRepository = runnerRepository;
        this.raceRepository = raceRepository;
        this.resultRepository = resultRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Runner runner1 = new Runner('Kis Anna', 30, 'Nő');
        Runner runner2 = new Runner('Nagy Ádám', 28, 'Férfi');
        Runner runner3 = new Runner('Harmat Eszter', 35, 'Nő');
        Runner runner4 = new Runner('Kovács István', 25, 'Férfi');
        runnerRepository.save(runner1);
        runnerRepository.save(runner2);
        runnerRepository.save(runner3);
        runnerRepository.save(runner4);

        Race race1 = new Race("Marathon", 42.195);
        Race race2 = new Race("5K Run", 5.0);
        raceRepository.save(race1);
        raceRepository.save(race2);

        resultRepository.save(new Result(runner1, race1, 240));
        resultRepository.save(new Result(runner2, race1, 260));
        resultRepository.save(new Result(runner3, race1, 300));
        resultRepository.save(new Result(runner4, race2, 25));
        resultRepository.save(new Result(runner1, race2, 20));
        resultRepository.save(new Result(runner3, race2, 22));
    }
}

