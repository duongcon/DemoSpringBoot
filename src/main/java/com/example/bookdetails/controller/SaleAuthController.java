package com.example.bookdetails.controller;

import com.example.bookdetails.entity.dto.request.LoginAuthRequest;
import com.example.bookdetails.util.API;
import com.example.bookdetails.util.OkHttpUtils;
import com.example.bookdetails.util.constants.ParamKey;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(API.V1)
@CrossOrigin
public class SaleAuthController {
    
    @PostMapping(API.SALE_AUTH_SIGN_IN)
    @ResponseBody
    public okhttp3.Response login(@RequestBody LoginAuthRequest request) {
        Gson gson = new Gson();
        String json = gson.toJson(request);
        okhttp3.Response response = null;
        try {
            response = OkHttpUtils.getInstance().postController(API.SALE_AUTH_SIGN_IN, json, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    @DeleteMapping(API.SALE_AUTH_SIGN_OUT)
    public okhttp3.Response logout(@RequestHeader(name = ParamKey.TOKEN) String token) {
        okhttp3.Response body = null;
        try {
            body = OkHttpUtils.getInstance().deleteController(API.SALE_AUTH_SIGN_OUT, token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }
}
