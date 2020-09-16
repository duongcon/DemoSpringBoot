package com.example.bookdetails.controller;

import com.example.bookdetails.entity.dto.request.CreateAdmin;
import com.example.bookdetails.entity.dto.request.UpdateAdmin;
import com.example.bookdetails.util.API;
import com.example.bookdetails.util.OkHttpUtils;
import com.example.bookdetails.util.constants.ParamKey;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(API.V1)
@CrossOrigin
public class AdminController {

    @GetMapping(API.ADMINS)
    @ResponseBody
    public okhttp3.Response listAdmin(@RequestHeader(name = ParamKey.TOKEN) String token) {
        okhttp3.Response body = null;
        try {
            body = OkHttpUtils.getInstance().getController(API.ADMINS, token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }

    @GetMapping(API.ADMINS)
    @ResponseBody
    public okhttp3.Response getAdminDetails(@RequestHeader(name = ParamKey.TOKEN) String token,
                                            @PathVariable(value = ParamKey.ID) Long id) {
        okhttp3.Response body = null;
        try {
            StringBuilder url = new StringBuilder();
            url.append(API.ADMINS).append("/").append(id);
            body = OkHttpUtils.getInstance().getController(url.toString(), token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }

    @PostMapping(API.ADMINS)
    @ResponseBody
    public okhttp3.Response createAdmin(@RequestHeader(name = ParamKey.TOKEN) String token, @RequestBody CreateAdmin request) {
        Gson gson = new Gson();
        String json = gson.toJson(request);
        okhttp3.Response body = null;
        try {
            body = OkHttpUtils.getInstance().postController(API.ADMINS, json, token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }

    @PutMapping(API.ADMINS)
    @ResponseBody
    public okhttp3.Response updateAdmin(@RequestHeader(name = ParamKey.TOKEN) String token,
                                        @PathVariable(value = ParamKey.ID) Long id,
                                        @RequestBody UpdateAdmin request) {
        okhttp3.Response body = null;
        Gson gson = new Gson();
        String json = gson.toJson(request);
        try {
            StringBuilder url = new StringBuilder();
            url.append(API.ADMINS).append("/").append(id);
            body = OkHttpUtils.getInstance().putController(url.toString(), json, token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }

    @PutMapping(API.ADMINS)
    @ResponseBody
    public okhttp3.Response updateAdminDeactive(@RequestHeader(name = ParamKey.TOKEN) String token,
                                                @PathVariable(value = ParamKey.ID) Long id) {
        return null;

    }
}
