package com.futoverseny.futoverseny.service;

import com.futoverseny.futoverseny.model.Result;
import com.futoverseny.futoverseny.repository.ResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {
    private final ResultRepository resultRepository;

    public ResultService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    public List<Result> getResultsByRaceId(Long raceId) {
        return resultRepository.findByRaceIdOrderByTimeAsc(raceId);
    }

    public Result addResult(Result result) {
        return resultRepository.save(result);
    }

    public double getAverageTimeByRaceId(Long raceId) {
        List<Result> results = resultRepository.findByRaceIdOrderByTimeAsc(raceId);
        return results.stream().mapToInt(Result::getTime).average().orElse(0);
    }
}
