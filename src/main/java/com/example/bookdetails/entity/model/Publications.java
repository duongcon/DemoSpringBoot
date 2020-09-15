package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Publications {
    private long id;
    private int status;
    private LocalDateTime releasedAtTime;
    private int kind;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
    private String slug;
    private int newType;
}
