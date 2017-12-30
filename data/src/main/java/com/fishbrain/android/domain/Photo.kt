package com.fishbrain.android.domain

import com.google.gson.annotations.SerializedName

/**
 * This is the POJO for photos
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
data class Photo(
        @field:SerializedName("sizes") val sizes: List<ImageSize>,
        @field:SerializedName("max_weight") val maxWeight: String
)
