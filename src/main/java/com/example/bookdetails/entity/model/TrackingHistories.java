package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TrackingHistories {
    private long id;
    private int seqNo;
    private LocalDateTime beginDate;
    private LocalDateTime endDate;
    private int applicationStatus;
    private boolean status;
    private long policyId;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
