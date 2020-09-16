package com.example.bookdetails.util;

import com.example.bookdetails.entity.dto.response.AbstractResponse;
import com.example.bookdetails.entity.dto.response.ResponseData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtils {

    private ResponseUtils() {
    }

    public static <T extends AbstractResponse>ResponseEntity<ResponseData> buildResponseData(T t, HttpStatus status) {
        return new ResponseEntity<>(new ResponseData(t), status);
    }
}
