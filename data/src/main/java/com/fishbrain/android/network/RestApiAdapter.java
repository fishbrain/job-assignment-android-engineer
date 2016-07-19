package com.fishbrain.android.network;


import com.fishbrain.android.BuildConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Calendar;

import retrofit.RestAdapter;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;

/**
 * This is the rest adapter used by Retrofit
 * <p/>
 * Created by dimitris.lachanas on 22/08/15.
 */
public class RestApiAdapter {

    private static RestAdapter sharedInstance = null;

    public static RestAdapter getInstance() {
        if (sharedInstance == null) {

            sharedInstance = new RestAdapter.Builder()
                    .setConverter(getConverter())
                    .setEndpoint(BuildConfig.BASE_URL)
                    .build();
        }

        return sharedInstance;
    }

    private static Converter getConverter() {
        Gson gson = new GsonBuilder().registerTypeAdapter(Calendar.class, new CalendarJsonDeserializer()).create();
        return new GsonConverter(gson);
    }
}