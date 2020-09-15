package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coverages {
    private long id;
    private String coverageNumberId;
    private String productNumberId;
    private String productNameEn;
    private String productNameVi;
    private int insDurInYears;
    private LocalDate startDate;
    private LocalDate endDate;
    private String insuredBpId;
    private String insuredName;
    private long minDeathBenefit;
    private long absolucateSumInsured;
    private int paymentFrequency;
    private long premiumAmount;
    private long policyId;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
}
