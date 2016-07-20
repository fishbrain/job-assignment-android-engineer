package com.fishbrain.android.network;


import com.fishbrain.android.BuildConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Calendar;

import retrofit2.converter.gson.GsonConverterFactory;


/**
 * This is the rest adapter used by RetrofitInstance
 * <p/>
 * Created by dimitris.lachanas on 22/08/15.
 */
public class RetrofitInstance {

    private static retrofit2.Retrofit sharedInstance = null;

    public static retrofit2.Retrofit getInstance() {
        if (sharedInstance == null) {
            sharedInstance = new retrofit2.Retrofit.Builder()
                    .addConverterFactory(getConverter())
                    .baseUrl(BuildConfig.BASE_URL)
                    .build();
        }

        return sharedInstance;
    }

    private static GsonConverterFactory getConverter() {
        Gson gson = new GsonBuilder().registerTypeAdapter(Calendar.class, new CalendarJsonDeserializer()).create();
        return GsonConverterFactory.create(gson);
    }
}