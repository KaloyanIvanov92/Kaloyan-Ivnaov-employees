package com.example.csv3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long employeeId;
    private Integer projectId;
    private LocalDate workFrom;
    private LocalDate workTo;
}
