package com.example.bookdetails.entity.dto.request;

import com.example.bookdetails.util.constants.ParamKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginAuthRequest extends AbstractRequest{
    @JsonProperty(ParamKey.EMAIL)
    private String email;
    @JsonProperty(ParamKey.PASSWORD)
    private String password;
}
