package com.fishbrain.android.network


import com.fishbrain.android.BuildConfig
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*


/**
 * This is the rest adapter used by RetrofitInstance
 *
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
object RetrofitInstance {

    val sharedInstance: Retrofit

    init {

        sharedInstance = Retrofit.Builder()
                .addConverterFactory(converter)
                .baseUrl(BuildConfig.BASE_URL)
                .build()
    }

    val instance: Retrofit
        get() {
            return sharedInstance
        }

    private val converter: GsonConverterFactory
        get() {
            val gson = GsonBuilder().registerTypeAdapter(Calendar::class.java, CalendarJsonDeserializer()).create()
            return GsonConverterFactory.create(gson)
        }
}