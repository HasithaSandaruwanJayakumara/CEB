package com.example.ceb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MeterReaderDTO {
    private int customerACN;
    private Date date;
    private Double value;
}
