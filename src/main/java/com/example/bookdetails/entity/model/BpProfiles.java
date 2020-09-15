package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BpProfiles {
    private long id;
    private String bpNumber;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
    private String fullName;
    private int title;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthDay;
    private String placeOfBirth;
    private int gender;
    private String building;
    private String roomNumber;
    private String floorNumber;
    private String houseNumber;
    private String street;
    private String street2;
    private String street3;
    private String street4;
    private String ward;
    private String district;
    private String otherCity;
    private String postalCode;
    private String city;
    private String region;
    private String countryKey;
    private String timeZone;
    private String telephoneNo;
    private String telephoneExtension;
    private String mobileNo;
    private String faxNumber;
    private String faxExtention;
    private String emailAddress;
    private int maritalStatus;
    private String occupationalClass;
    private String countryOrigin;
    private String annualIncome;
    private String monthlyAvgIncome;
    private String annualIncomeCurrencyKey;
    private String idType;
    private String idNumber;
    private String bankId;
    private String bankCountryKey;
    private String bankKey;
    private String bankAccountNumber;
    private boolean isCustomer;
    private boolean newAssigned;
}
