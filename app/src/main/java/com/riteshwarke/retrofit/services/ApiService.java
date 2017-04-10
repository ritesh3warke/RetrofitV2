package com.riteshwarke.retrofit.services;

import com.google.gson.JsonElement;
import com.riteshwarke.retrofit.models.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Ritesh Warke on 08/04/17.
 */

public interface ApiService {
    @POST("user/signup")
    Call<JsonElement> signup(@Body User u);

}
