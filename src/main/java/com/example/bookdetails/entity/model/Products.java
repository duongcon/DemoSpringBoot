package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Products {
    private long id;
    private String name;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
