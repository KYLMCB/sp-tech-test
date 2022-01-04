package com.kylmcb.techtest.database;

import com.kylmcb.techtest.models.ElecReading;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ElecReadingRepository extends JpaRepository<ElecReading, Long> {

}

