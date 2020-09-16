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
public class CreateAdmin extends AbstractRequest{
    @JsonProperty(ParamKey.EMAIL)
    @NotNull
    private String email;
    @JsonProperty(ParamKey.FULL_NAME)
    @NotNull
    private String fullName;
    @JsonProperty(ParamKey.PASSWORD)
    private String password;
    @JsonProperty(ParamKey.PHONE_NUMBER)
    @NotNull
    private String phoneNumber;
    @JsonProperty(ParamKey.STATUS)
    private Boolean status;
}
