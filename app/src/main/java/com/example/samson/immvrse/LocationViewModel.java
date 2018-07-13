package com.example.samson.immvrse;

import android.util.Log;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LocationViewModel {

    public LocationViewModel() {
    }

    public void getFeedUsers() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.example.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        final UserService userService = retrofit.create(UserService.class);
        userService.getUsers(10,1).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMapIterable(userResponse -> userResponse)
                .map(User::getUserName)
                .subscribe(s -> Log.e("username", s));
    }
}