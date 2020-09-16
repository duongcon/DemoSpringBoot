package com.example.bookdetails.entity.dto.request;

import com.example.bookdetails.util.constants.ParamKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateLeads {
    @JsonProperty(ParamKey.TITLE)
    private String title;
    @JsonProperty(ParamKey.LAST_NAME)
    private String lastName;
    @JsonProperty(ParamKey.FIRST_NAME)
    private String firstName;
    @JsonProperty(ParamKey.PHONE)
    private String phone;
    @JsonProperty(ParamKey.EMAIL)
    private String email;
    @JsonProperty(ParamKey.PASSPORT)
    private String passport;
    @JsonProperty(ParamKey.GENDER)
    private Integer gender;
    @JsonProperty(ParamKey.CHILDREN)
    private String children;
    @JsonProperty(ParamKey.JOB_TITLE)
    private String jobTitle;
    @JsonProperty(ParamKey.NOTE)
    private String note;
    @JsonProperty(ParamKey.CITY_ID)
    private String cityId;
    @JsonProperty(ParamKey.BIRTH_DAY)
    private String birthDay;
    @JsonProperty(ParamKey.LEAD_SOURCE_ATTRIBUTES)
    private JsonObject leadSourceAttributes;
    @JsonProperty(ParamKey.BANK_STAFF_NAME)
    private String bankStaffName;
    @JsonProperty(ParamKey.BANK_STAFF_CODE)
    private String bankStaffCode;
    @JsonProperty(ParamKey.BANK_STAFF_EMAIL)
    private String bankStaffEmail;
    @JsonProperty(ParamKey.BANK_STAFF_PHONE)
    private String bankStaffPhone;
    @JsonProperty(ParamKey.MAIN_SOURCE_ID)
    private long mainSourceId;
    @JsonProperty(ParamKey.BANK_REGION_ID)
    private long bankRegionId;
    @JsonProperty(ParamKey.BANK_BRANCH_ID)
    private long bankBranchId;
    @JsonProperty(ParamKey.LEADS_PRODUCTS_ATTRIBUTES)
    private JsonArray leadsProductsAttributes;
    @JsonProperty(ParamKey.PRODUCT_ID)
    private long productId;
}
