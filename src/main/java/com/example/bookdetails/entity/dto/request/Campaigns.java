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
public class Campaigns {
    @JsonProperty(ParamKey.TITLE_EN)
    @NotNull
    private String titleEn;
    @JsonProperty(ParamKey.SHORT_DESCRIPTION_EN)
    private String shortDescriptionEn;
    @JsonProperty(ParamKey.FULL_DESCRIPTION_EN)
    private String fullDescriptionEn;
    @JsonProperty(ParamKey.THUMBNAIL_IMG_EN)
    private long thumbnailImgEn;
    @JsonProperty(ParamKey.TITLE_VI)
    @NotNull
    private String titleVi;
    @JsonProperty(ParamKey.SHORT_DESCRIPTION_VI)
    private String shortDescriptionVi;
    @JsonProperty(ParamKey.FULL_DESCRIPTION_VI)
    private String fullDescriptionVi;
    @JsonProperty(ParamKey.THUMBNAIL_IMG_VI)
    private long thumbnailImgVi;
    @JsonProperty(ParamKey.STATUS)
    private long status;
    @JsonProperty(ParamKey.NEWS_TYPE)
    private String newsType;
}
