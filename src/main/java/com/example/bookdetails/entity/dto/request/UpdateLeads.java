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
public class UpdateLeads {
    @JsonProperty(ParamKey.TITLE)
    private String title;
    @JsonProperty(ParamKey.TITLE_DISPLAY)
    private String titleDisplay;
    @JsonProperty(ParamKey.NAME)
    private String name;
    @JsonProperty(ParamKey.LAST_NAME)
    private String lastName;
    @JsonProperty(ParamKey.FIRST_NAME)
    private String firstName;
    @JsonProperty(ParamKey.ID_NO)
    private String idNo;
    @JsonProperty(ParamKey.GENDER)
    private long gender;
    @JsonProperty(ParamKey.BIRTH_DAY)
    private String birthDay;
    @JsonProperty(ParamKey.PASSPORT)
    private String passport;
    @JsonProperty(ParamKey.JOB_TITLE)
    private String jobTitle;
    @JsonProperty(ParamKey.CHILDREN)
    private long children;
    @JsonProperty(ParamKey.PHONE)
    private String phone;
    @JsonProperty(ParamKey.EMAIL)
    private String email;
    @JsonProperty(ParamKey.NOTE)
    private String note;
    @JsonProperty(ParamKey.ADDRESS)
    private JsonObject address;
    @JsonProperty(ParamKey.STREET)
    private String street;
    @JsonProperty(ParamKey.WARD)
    private String ward;
    @JsonProperty(ParamKey.DISTRICT)
    private String district;
    @JsonProperty(ParamKey.CITY)
    private JsonObject city;
    @JsonProperty(ParamKey.ID)
    private String id;
    @JsonProperty(ParamKey.VALUE)
    private String value;
    @JsonProperty(ParamKey.MARRIAGE)
    private long marriage;
//    private String street;
    @JsonProperty(ParamKey.CITY_ID)
    private String cityId;
    @JsonProperty(ParamKey.LEAD_SOURCE_ATTRIBUTES)
    private JsonObject leadSourceAttributes;
//    private String id;
    @JsonProperty(ParamKey.LEAD_ID)
    private long leadId;
    @JsonProperty(ParamKey.MAIN_SOURCE_ID)
    private long mainSourceId;
    @JsonProperty(ParamKey.SUB_SOURCE_ID)
    private long subSourceId;
    @JsonProperty(ParamKey.BANK_STAFF_CODE)
    private String bankStaffCode;
    @JsonProperty(ParamKey.BANK_STAFF_NAME)
    private String bankStaffName;
    @JsonProperty(ParamKey.BANK_STAFF_PHONE)
    private String bankStaffPhone;
    @JsonProperty(ParamKey.BANK_STAFF_EMAIL)
    private String bankStaffEmail;
    @JsonProperty(ParamKey.BANK_REGION_ID)
    private long bankRegionId;
    @JsonProperty(ParamKey.BANK_BRANCH_ID)
    private long bankBranchId;
    @JsonProperty(ParamKey.LEADS_PRODUCTS_ATTRIBUTES)
    private JsonArray leadsProductsAttributes;
//    private String leadId;
    @JsonProperty(ParamKey.PRODUCT_ID)
    private String productId;
    @JsonProperty(ParamKey.DOCUMENTS_ATTRIBUTES)
    private JsonArray documentsAttributes;
//    private long id;
    @JsonProperty(ParamKey.KIND_NAME)
    private String kindName;
}
