package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StatusComments {
    private long id;
    private String content;
    private int leadId;
    private int status;
    private int saleId;
    private LocalDateTime createdId;
    private LocalDateTime updatedId;
}
