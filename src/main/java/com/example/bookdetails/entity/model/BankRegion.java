package com.example.bookdetails.entity.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class BankRegion {
    private long id;
    private String name;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
