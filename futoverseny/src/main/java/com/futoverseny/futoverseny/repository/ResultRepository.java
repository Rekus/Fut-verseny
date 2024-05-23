package com.futoverseny.futoverseny.repository;

import com.futoverseny.futoverseny.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Long> {
    List<Result> findByRaceIdOrderByTimeAsc(Long raceId);
}
