package com.example.bookdetails.controller;

import com.example.bookdetails.entity.data.LoginResponse;
import com.example.bookdetails.entity.data.ResponseData;
import com.example.bookdetails.entity.request.LoginRequest;
import com.example.bookdetails.util.API;
import com.example.bookdetails.util.OkHttpUtils;
import com.google.gson.JsonObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(API.V1)
@CrossOrigin
public class AuthController {

    @PostMapping(API.AUTH_SIGN_IN)
    @ResponseBody
    public Object login(@RequestBody LoginRequest request) throws IOException {
        String json = request.toString();
        System.out.println(json);
        String data = OkHttpUtils.getInstance().postController(API.AUTH_SIGN_IN, json);
        System.out.println(data);
        return data;
    }

    @RequestMapping(value = "/sign_out", method = RequestMethod.DELETE)
    public String logout(@RequestHeader(name = "token") String token) {
        return null;
    }
}
