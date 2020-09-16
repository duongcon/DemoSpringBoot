package com.example.bookdetails.entity.dto.request;

import com.example.bookdetails.util.constants.ParamKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateActivityDetails {
    @JsonProperty(ParamKey.TITLE)
    private String title;
    @JsonProperty(ParamKey.NOTE)
    private String note;
    @JsonProperty(ParamKey.STATUS)
    private Boolean status;
    @JsonProperty(ParamKey.LEAD_ID)
    private long leadId;
    @JsonProperty(ParamKey.BP_PROFILE_ID)
    private long BpProfileId;
    @JsonProperty(ParamKey.ACTIVITY_TYPE_ID)
    @NotNull
    private long activityTypeId;
    @JsonProperty(ParamKey.BEGIN_DATE)
    @NotNull
    private String beginDate;
    @JsonProperty(ParamKey.BEGIN_TIME)
    @NotNull
    private String beginTime;
    @JsonProperty(ParamKey.END_DATE)
    @NotNull
    private String endDate;
    @JsonProperty(ParamKey.END_TIME)
    @NotNull
    private String endTime;
}
