package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class ActivityTypes {
    private long id;
    private String name;
    private String fieldName;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
