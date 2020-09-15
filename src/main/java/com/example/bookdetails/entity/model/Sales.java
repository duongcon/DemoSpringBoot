package com.example.bookdetails.entity.model;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sales {
    private long id;
    private String provider;
    private String uid;
    private String encryptedPassword;
    private String resetPasswordToken;
    private LocalDateTime resetPasswordSentAtTime;
    private LocalDateTime rememberCreatedAtTime;
    private String icNumber;
    private String ccNumber;
    private String bpNumber;
    private String fullName;
    private String email;
    private boolean status;
    private LocalDateTime archivedAtTime;
    private long roleId;
    private JsonObject tokens;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
    private long bankBranchId;
    private long mbalRoleId;
}
