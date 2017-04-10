package com.riteshwarke.retrofit.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.riteshwarke.retrofit.R;
import com.riteshwarke.retrofit.helpers.AppCpnstants;
import com.riteshwarke.retrofit.models.User;
import com.riteshwarke.retrofit.services.ApiService;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        signUp();

    }

    private void signUp() {
        User u = new User();
        u.setEmail("ritesh3warke@gmail.com");
        u.setDemoId("1491656839000");
        u.setDeviceId("hardware");
        u.setLat("19.136325");
        u.setLng("72.827660");
        u.setLocality("Andheri West");
        u.setName("Ritesh Warke");
        u.setGcmId("gyani");
        u.setNo("+919999999999");
        u.setPlatform("android");
        u.setRole("user");

        Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(AppCpnstants.APIBaseUrl)
                .build();

        ApiService apiService = retrofit.create(ApiService.class);
        apiService.signup(u).enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {

                try {
                    JSONObject jsonResponse = new JSONObject(response.body().toString());
                    //Decode JSON here and then do whatever you want to do man
                    // Log.i(TAG, "success " + jsonResponse.getString("fieldName"));
                   // Log.i(TAG, "success " + jsonResponse.getJSONObject("objectName").getString("fieldName"));
                } catch (Exception e) {
                    Log.i(TAG, "Caught in the exception " + e.getMessage());
                }
            }


            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
                Log.i(TAG, "fail " + t.getMessage());
            }
        });

    }
}
