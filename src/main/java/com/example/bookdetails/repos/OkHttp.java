package com.example.bookdetails.repos;

import com.example.bookdetails.util.constants.ParamKey;
import okhttp3.*;

import java.io.IOException;

public class OkHttp {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static OkHttp instance = null;
    private static final String URL = "http://10.0.65.25/api/v1";

    private OkHttp() {
    }

    public static OkHttp getInstance() {
        if (instance == null) {
            instance = new OkHttp();
        }
        return instance;
    }

    OkHttpClient client = new OkHttpClient();

    public Response postController(String url, String json, String token) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
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
        Request request = new Request.Builder()
                .addHeader(ParamKey.TOKEN, token)
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }

    public Response putController(String url, String json, String token) throws IOException {
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
        Request request = new Request.Builder()
                .addHeader(ParamKey.TOKEN, token)
                .url(url)
                .delete()
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response;
        }
    }

    public String createUrlByApi(String api) {
        return URL+api;
    }

    public String createUrlByPathVariable(String... pathVariable) {
        return null;
    }

    public String createUrlByRequestParam(String... requestParam) {
        return null;
    }
}
