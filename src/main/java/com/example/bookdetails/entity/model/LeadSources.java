package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeadSources {
    private long id;
    private String bankStaffCode;
    private String bankStaffName;
    private String bankStaffPhone;
    private String bankStaffEmail;
    private long mainSourceId;
    private long subSourceId;
    private long leadId;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
    private long bankBranchId;
    private long bankRegionId;
}
