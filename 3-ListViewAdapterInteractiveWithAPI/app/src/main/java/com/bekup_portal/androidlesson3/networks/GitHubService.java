package com.bekup_portal.androidlesson3.networks;

import com.bekup_portal.androidlesson3.models.Followers;
import com.bekup_portal.androidlesson3.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GitHubService {
    @GET("users/derohimat")
    Call<User> getUser();

    @GET("users/derohimat/followers")
    Call<List<Followers>> getFollowers();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}