package com.fishbrain.assignment.data.domain

import com.google.gson.annotations.SerializedName

/**
 * Created by dimitris.lachanas on 22/08/15.
 */
data class ImageSize(
        @field:SerializedName("geometry") val geometry: String,
        @field:SerializedName("url") val url: String,
        @field:SerializedName("name") val name: String,
        @field:SerializedName("width") val width: String,
        @field:SerializedName("height") val height: String)
