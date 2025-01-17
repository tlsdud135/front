package com.moworkspace.pixel_front;


import androidx.annotation.CheckResult;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitInterface {
    @POST("/login")
    Call<LoginResult> executeLogin(@Body HashMap<String, String> map);

    @POST("/singup")
    Call<Void> executeSignup(@Body HashMap<String, String> map);

    @POST("/leave")
    Call<LoginResult> executeLeave (@Body HashMap<String, String> map);

    @POST("/check") //이메일 보내기 (인증번호용)
    Call<CheckResult> executeCheck (@Body HashMap<String, String> map);

}
