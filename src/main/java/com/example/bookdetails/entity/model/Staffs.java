package com.example.bookdetails.entity.model;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Staffs {
    private long id;
    private String provider;
    private String uid;
    private String encryptedPassword;
    private String resetPasswordToken;
    private LocalDateTime resetPasswordSentAtTime;
    private LocalDateTime rememberCreatedAtTime;
    private String fullName;
    private String phoneNumber;
    private boolean status;
    private String email;
    private LocalDateTime archivedAtTime;
    private JsonObject tokens;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
    private long roleId;
}
