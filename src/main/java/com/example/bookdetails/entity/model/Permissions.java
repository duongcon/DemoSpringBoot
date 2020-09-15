package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Permissions {
    private long id;
    private String varchar;
    private String text;
    private String controllerPath;
    private String actionName;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
