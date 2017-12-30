package com.fishbrain.android.domain


import com.google.gson.annotations.SerializedName

/**
 * Created by dimitris.lachanas on 22/08/15.
 */
data class Avatar(@field:SerializedName("sizes") val sizes: List<ImageSize>)
