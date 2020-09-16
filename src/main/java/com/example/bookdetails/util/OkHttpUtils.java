package com.example.bookdetails.util;

import com.example.bookdetails.util.constants.ParamKey;
import okhttp3.*;

import java.io.IOException;

public class OkHttpUtils {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static OkHttpUtils instance = null;
    private static final String URL = "http://10.0.65.25/api/v1";

    private OkHttpUtils() {
    }

    public static OkHttpUtils getInstance() {
        if (instance == null) {
            instance = new OkHttpUtils();
        }
        return instance;
    }

    OkHttpClient client = new OkHttpClient();

    public Response postController(String url, String json, String token) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        url = URL+url;

        Request request;
        if (token != null) {
            request = new Request.Builder()
                    .addHeader(ParamKey.TOKEN, token)
                    .url(url)
                    .post(body)
                    .build();
        } else {
            request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();
        }
        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }

    public Response getController(String url, String token) throws IOException {
        url = URL + url;
        Request request = new Request.Builder()
                .addHeader(ParamKey.TOKEN, token)
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }

    public Response putController(String url, String json, String token) throws IOException {
        url = URL + url;
        RequestBody requestBody = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .addHeader(ParamKey.TOKEN, token)
                .url(url)
                .post(requestBody)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }

    public Response deleteController(String url, String token) throws IOException {
        url = URL+url;
        Request request = new Request.Builder()
                .addHeader(ParamKey.TOKEN, token)
                .url(url)
                .delete()
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }
}
