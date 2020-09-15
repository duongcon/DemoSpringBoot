package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leads {
    private long id;
    private String idNo;
    private String passport;
    private String phone;
    private String cityId;
    private String districtId;
    private String wardId;
    private String street;
    private int status;
    private int gender;
    private LocalDate birthDay;
    private int marriage;
    private int children;
    private String jobTitle;
    private String note;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
    private String email;
    private long saleId;
    private int title;
    private String firstName;
    private String lastName;
    private int segmentation;
    private int identificationType;
    private String fullName;
    private int line;
    private String identificationNumber;
    private int rejectionReason;
    private String rmCode;
}
