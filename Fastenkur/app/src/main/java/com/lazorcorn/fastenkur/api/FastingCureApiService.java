package com.lazorcorn.fastenkur.api;

import com.lazorcorn.fastenkur.mvp.model.FastingCureResponse;

import java.util.Observable;

import retrofit2.http.GET;

public interface FastingCureApiService {
    @GET("/wp-content/uploads/2018/11/FastenGuide.json")
    rx.Observable<FastingCureResponse> getCourse();

    @GET("/wp-content/uploads/2018/11/FastenGuide.json")
    rx.Observable<FastingCureResponse> getCourseDays();
}
