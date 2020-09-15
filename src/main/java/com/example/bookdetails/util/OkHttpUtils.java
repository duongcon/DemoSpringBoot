package com.example.bookdetails.util;

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

    public String postController(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        url = URL+url;
        System.out.println(url);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.toString());
            return response.body().toString();
        }
    }

    public String getController() throws IOException {
        Request request = new Request.Builder()
                .url(URL)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public String putController(String json) throws IOException {
        RequestBody requestBody = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(URL)
                .post(requestBody)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public String deleteController() throws IOException {
        Request request = new Request.Builder()
                .url(URL)
                .delete()
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
