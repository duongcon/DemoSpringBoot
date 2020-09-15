package com.example.bookdetails.entity.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class ActivityDetails {
    private long id;
    private String title;
    private long activityTypeId;
    private long leadId;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
    private long saleId;
    private boolean status;
    private String note;
    private LocalDate beginDate;
    private LocalTime beginTime;
    private LocalDate endDate;
    private LocalTime endTime;
    private long bpProfileId;
    private String googleCalendarId;
}
