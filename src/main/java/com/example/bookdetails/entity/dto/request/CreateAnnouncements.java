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
public class CreateAnnouncements {
    @JsonProperty(ParamKey.SHORT_DESCRIPTION_EN)
    @NotNull
    private String shortDescriptionEn;
    @JsonProperty(ParamKey.SHORT_DESCRIPTION_VI)
    @NotNull
    private String shortDescriptionVi;
    @JsonProperty(ParamKey.STATUS)
    private long status;
}
