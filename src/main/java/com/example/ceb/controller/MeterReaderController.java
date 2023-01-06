package com.example.ceb.controller;


import com.example.ceb.dto.MeterReaderDTO;
import com.example.ceb.dto.ResponseDTO;
import com.example.ceb.service.CustomerService;
import com.example.ceb.service.MeterReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/meterReader")
public class MeterReaderController {
    @Autowired
    private MeterReaderService meterReaderService;

    @Autowired
    private ResponseDTO responseDTO;

    @PostMapping(value = "/meterValue")
    public MeterReaderDTO addMeterRederData(@RequestBody MeterReaderDTO meterReaderDTO){
        return meterReaderService.addMeterRederData(meterReaderDTO);


    }

}
