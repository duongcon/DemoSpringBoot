package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FriendlyIdSlugs {
    private long id;
    private String slug;
    private int sluggableId;
    private String sluggableType;
    private String scope;
    private LocalDateTime createdAtTime;
}
