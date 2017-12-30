package com.fishbrain.android.domain

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * This is the POJO for Owners
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
data class Owner(
        @field:SerializedName("nickname") val nickName: String,
        @field:SerializedName("first_name") val firstName: String,
        @field:SerializedName("last_name") val lastName: String,
        @field:SerializedName("country_code") val countryCode: String,
        @field:SerializedName("created_at") val dateCreated: Calendar,
        @field:SerializedName("featured") val isFeatured: Boolean,
        @field:SerializedName("is_premium") val isIsPremium: Boolean,
        @field:SerializedName("avatar") val avatar: Avatar
)
