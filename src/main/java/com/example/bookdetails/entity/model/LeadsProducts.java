package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LeadsProducts {
    private long id;
    private long productId;
    private long leadId;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
