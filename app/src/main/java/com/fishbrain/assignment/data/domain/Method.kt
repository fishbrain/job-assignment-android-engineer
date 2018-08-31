package com.fishbrain.assignment.data.domain

import com.google.gson.annotations.SerializedName

/**
 * Created by dimitris.lachanas on 23/08/15.
 */
data class Method(
        @field:SerializedName("id") val id: Int,
        @field:SerializedName("type") val type: String,
        @field:SerializedName("localized_name") val localizedName: String)
