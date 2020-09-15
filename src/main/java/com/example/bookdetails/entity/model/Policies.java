package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policies {
    private long id;
    private String policyNumber;
    private LocalDate effectiveDate;
    private String bpNumber;
    private String policyHolderName;
    private String extApplicationNo;
    private LocalDate policyStart;
    private String mainProductId;
    private String mainProductName;
    private int insuranceDurationInYears;
    private int paymentFrequency;
    private long premiumAmount;
    private String beneficiaryId;
    private String beneficiaryName;
    private int distributionChanne;
    private String ccNumber;
    private String commissionContractName;
    private String currency;
    private int status;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
    private boolean newAssigned;
    private long suspenseAmount;
    private int applicationStatus;
}
