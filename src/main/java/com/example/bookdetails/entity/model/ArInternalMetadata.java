package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArInternalMetadata {
    private String key;
    private String value;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
