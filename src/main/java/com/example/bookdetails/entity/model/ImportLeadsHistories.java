package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImportLeadsHistories {
    private long id;
    private String fileName;
    private String version;
    private int error;
    private int successes;
    private String errorRows;
    private int status;
    private long saleId;
    private long staffId;
    private LocalDateTime createdAtTime;
    private LocalDateTime updateAtTime;
}
