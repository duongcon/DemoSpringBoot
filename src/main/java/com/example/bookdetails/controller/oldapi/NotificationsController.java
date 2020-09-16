package com.example.bookdetails.controller.oldapi;

import com.example.bookdetails.repos.OkHttp;
import com.example.bookdetails.util.API;
import com.example.bookdetails.util.constants.ParamKey;
import com.example.bookdetails.util.loggers.Loggers;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(API.V1)
@CrossOrigin
public class NotificationsController {

    Loggers loggers = new Loggers();

    @GetMapping(API.NOTIFICATIONS)
    @ResponseBody
    public okhttp3.Response listNotification(@RequestHeader(name = ParamKey.TOKEN) String token,
                                             @RequestParam(value = ParamKey.PAGE) int page,
                                             @RequestParam(value = ParamKey.PER_PAGE) int perPage) {
        okhttp3.Response body = null;
        try {
            body = OkHttp.getInstance().getController(API.NOTIFICATIONS, token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }
}
