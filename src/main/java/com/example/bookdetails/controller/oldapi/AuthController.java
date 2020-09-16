package com.example.bookdetails.controller.oldapi;

import com.example.bookdetails.entity.dto.request.LoginAuthRequest;
import com.example.bookdetails.util.API;
import com.example.bookdetails.repos.OkHttp;
import com.example.bookdetails.util.constants.ParamKey;
import com.example.bookdetails.util.loggers.Loggers;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(API.V1)
@CrossOrigin
public class AuthController {

    Loggers loggers = new Loggers();

    @PostMapping(API.AUTH_SIGN_IN)
    @ResponseBody
    public okhttp3.Response login(@RequestBody LoginAuthRequest request){
        Gson gson = new Gson();
        String json = gson.toJson(request);
        okhttp3.Response body = null;
        try {
            body = OkHttp.getInstance().postController(API.AUTH_SIGN_IN, json, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }

    @DeleteMapping(API.AUTH_SIGN_OUT)
    public okhttp3.Response logout(@RequestHeader(name = ParamKey.TOKEN) String token) {
        okhttp3.Response body = null;
        try {
            body = OkHttp.getInstance().deleteController(API.AUTH_SIGN_IN, token);
        } catch (IOException e) {
            loggers.error(e);
            e.printStackTrace();
        }
        return body;
    }
}
