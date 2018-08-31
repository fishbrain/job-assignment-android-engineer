package com.fishbrain.assignment.data.domain


import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * This is the POJO for catches
 *
 * Created by dimitris.lachanas on 22/08/15.
 *
 */
data class Catch(
        @SerializedName("type") val type: String,
        @SerializedName("id") val id: Int,
        @SerializedName("description") val description: String,
        @SerializedName("caught_at_local_time_zone") val dateCaughtLocal: Calendar,
        @SerializedName("caught_at_gmt") val dateCaught: Calendar,
        @SerializedName("weight") val weight: Double,
        @SerializedName("length") val length: Double = 0.toDouble(),
        @SerializedName("created_at") val dateCreated: Calendar,
        @SerializedName("owner") val owner: Owner,
        @SerializedName("species") val species: Species,
        @SerializedName("photos") val photoContainers: List<PhotoContainer>,
        @SerializedName("method") val method: Method? = null
)