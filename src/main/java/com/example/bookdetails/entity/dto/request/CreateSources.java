package com.example.bookdetails.entity.dto.request;

import com.example.bookdetails.util.constants.ParamKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateSources {
    @JsonProperty(ParamKey.CODE)
    private String code;
    @JsonProperty(ParamKey.NAME)
    private String name;
    @JsonProperty(ParamKey.STATUS)
    private Boolean status;
}
