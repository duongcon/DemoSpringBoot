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
public class UpdateAdmin {
    @JsonProperty(ParamKey.FULL_NAME)
    @NotNull
    private String fullName;
    @JsonProperty(ParamKey.PHONE_NUMBER)
    @NotNull
    private String phoneNumber;
    @JsonProperty(ParamKey.STATUS)
    private Boolean status;
    @JsonProperty(ParamKey.PASSWORD)
    private String password;
    @JsonProperty(ParamKey.PASSWORD_CONFIRMATION)
    private String passwordConfirmation;
}
