package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RolesPermissions {
    private long id;
    private long roleId;
    private long permissionId;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
