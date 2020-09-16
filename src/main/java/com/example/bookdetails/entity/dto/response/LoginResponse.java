package com.example.bookdetails.entity.dto.response;

import lombok.Data;

@Data
public class LoginResponse extends AbstractResponse {
    private String token;

    public LoginResponse(double code) {
        this.code = code;
    }

    //    public LoginResponse(double code, String token, User user) {
    public LoginResponse(double code, String token) {
        this.code = code;
        this.token = token;
    }
}
