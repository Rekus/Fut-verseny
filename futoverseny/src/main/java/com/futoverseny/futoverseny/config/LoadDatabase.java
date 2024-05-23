import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class LoadDatabase {

    @Autowired
    private RunnerRepository runnerRepo;
    @Autowired
    private RaceRepository raceRepo;
    @Autowired
    private ResultRepository resultRepo;

    @Bean
    CommandLineRunner initDatabase() {
        return args -> {
            Runner r1 = new Runner('Kis Anna', 30, 'Nő');
            Runner r2 = new Runner('Nagy Ádám', 28, 'Férfi');
            Runner r3 = new Runner('Harmat Eszter', 35, 'Nő');
            Runner r4 = new Runner('Kovács István', 25, 'Férfi');
            runnerRepo.save(r1);
            runnerRepo.save(r2);
            runnerRepo.save(r3);
            runnerRepo.save(r4);

            Race race1 = new Race("Marathon", 42.195);
            Race race2 = new Race("5K Run", 5.0);
            raceRepo.save(race1);
            raceRepo.save(race2);

            resultRepo.save(new Result(r1, race1, 240));
            resultRepo.save(new Result(r2, race1, 250));
            resultRepo.save(new Result(r3, race1, 260));
            resultRepo.save(new Result(r4, race1, 270));
            resultRepo.save(new Result(r1, race2, 120));
            resultRepo.save(new Result(r2, race2, 125));
        };
    }
}

