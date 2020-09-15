package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Banks {
    private long id;
    private String name;
    private String code;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
