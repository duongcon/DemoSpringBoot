package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SyncHistories {
    private long id;
    private int kind;
    private LocalDateTime lastSync;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
