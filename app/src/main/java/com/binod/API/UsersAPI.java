package com.binod.API;

import com.binod.Model.Users;
import com.binod.ServerResponse.ImageResponse;
import com.binod.ServerResponse.SignUpResonse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UsersAPI {
    @POST("users/signup")
    Call<SignUpResonse> registerUser(@Body Users users);

    @FormUrlEncoded
    @POST("users/login")
    Call<SignUpResonse> checkUser(@Field("username") String username, @Field("password") String password);

    @Multipart
    @POST("upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part img);

}
