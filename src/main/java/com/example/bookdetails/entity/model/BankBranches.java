package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankBranches {
    private long id;
    private String name;
    private long bankId;
    private long bankRegionId;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
