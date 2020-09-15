package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MasterData {
    private long id;
    private String category;
    private String name;
    private String value;
    private long createdAtTime;
    private long updatedAtTime;
}
