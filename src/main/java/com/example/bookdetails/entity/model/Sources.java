package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sources {
    private long id;
    private String code;
    private String name;
    private boolean status;
    private int parentId;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
