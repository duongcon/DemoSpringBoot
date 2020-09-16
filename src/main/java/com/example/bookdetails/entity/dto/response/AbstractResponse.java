package com.example.bookdetails.entity.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class AbstractResponse {
    protected String message;

    protected double code;

    public AbstractResponse() {}

    public AbstractResponse(double code) {
        this.code = code;
    }

    public AbstractResponse(String message) {
        this.message = message;
    }
}
