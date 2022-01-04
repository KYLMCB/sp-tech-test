package com.kylmcb.techtest.database;

import com.kylmcb.techtest.models.GasReading;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface GasReadingRepository extends JpaRepository<GasReading, Long> {

}
