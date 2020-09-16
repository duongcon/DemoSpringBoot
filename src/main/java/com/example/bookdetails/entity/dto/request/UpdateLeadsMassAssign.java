package com.example.bookdetails.entity.dto.request;

import com.example.bookdetails.util.constants.ParamKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.JsonArray;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLeadsMassAssign {
    @JsonProperty(ParamKey.LEAD_IDS)
    private JsonArray leadIds;
    @JsonProperty(ParamKey.SALE_ID)
    private long saleId;
}
