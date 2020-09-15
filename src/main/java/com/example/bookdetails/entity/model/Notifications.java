package com.example.bookdetails.entity.model;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notifications {
    private long id;
    private String title;
    private JsonObject body;
    private int kind;
    private String sendTo;
    private String objectType;
    private String objectSlug;
    private String objectId;
    private LocalDateTime createdAtTime;
}
