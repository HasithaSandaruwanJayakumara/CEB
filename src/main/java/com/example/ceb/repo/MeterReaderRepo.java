package com.example.ceb.repo;

import com.example.ceb.dto.MeterReaderDTO;
import com.example.ceb.entity.MeterReader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeterReaderRepo extends JpaRepository<MeterReader,Integer> {
}
