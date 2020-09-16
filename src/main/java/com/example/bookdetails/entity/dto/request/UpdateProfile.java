package com.example.bookdetails.entity.dto.request;

import com.example.bookdetails.util.constants.ParamKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProfile extends AbstractRequest{
    @JsonProperty(ParamKey.FULL_NAME)
    private String fullName;
    @JsonProperty(ParamKey.PHONE_NUMBER)
    private String phoneNumber;
    @JsonProperty(ParamKey.PASSWORD)
    private String password;
    @JsonProperty(ParamKey.PASSWORD_CONFIRMATION)
    private String passwordConfirmation;
}
