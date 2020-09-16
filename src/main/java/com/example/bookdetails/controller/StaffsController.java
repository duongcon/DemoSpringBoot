package com.example.bookdetails.controller;

import com.example.bookdetails.entity.dto.request.UpdateProfile;
import com.example.bookdetails.util.API;
import com.example.bookdetails.util.OkHttpUtils;
import com.example.bookdetails.util.constants.ParamKey;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(API.V1)
@CrossOrigin
public class StaffsController {
    
    @GetMapping(API.STAFFS_PROFILE)
    @ResponseBody
    public okhttp3.Response getProfile(@RequestHeader(name = ParamKey.TOKEN) String token){
        okhttp3.Response body = null;
        try {
            body = OkHttpUtils.getInstance().getController(API.STAFFS_PROFILE, token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }

    @PutMapping(API.STAFFS_UPDATE_PROFILE)
    @ResponseBody
    public okhttp3.Response updateProfile(@RequestBody UpdateProfile request, @RequestHeader(name = ParamKey.TOKEN) String token) {
        Gson gson = new Gson();
        String json = gson.toJson(request);
        okhttp3.Response body = null;
        try {
            body = OkHttpUtils.getInstance().postController(API.STAFFS_UPDATE_PROFILE, json, token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }
}
