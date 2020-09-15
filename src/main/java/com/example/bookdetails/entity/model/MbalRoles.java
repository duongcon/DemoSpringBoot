package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MbalRoles {
    private long id;
    private String code;
    private String name;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
