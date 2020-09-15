package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PremiumCollections {
    private long id;
    private String policyNumber;
    private LocalDate dueFromDate;
    private LocalDate dueToDate;
    private long premiumAmount;
    private int status;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
