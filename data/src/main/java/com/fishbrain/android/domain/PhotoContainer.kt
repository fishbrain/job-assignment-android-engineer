package com.fishbrain.android.domain

import com.google.gson.annotations.SerializedName

/**
 * This is the POJO for PhotoContainers
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
data class PhotoContainer(@SerializedName("photo") val photo: Photo)
