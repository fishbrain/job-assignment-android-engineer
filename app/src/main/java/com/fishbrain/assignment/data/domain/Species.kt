package com.fishbrain.assignment.data.domain

import com.google.gson.annotations.SerializedName

/**
 * This is the POJO for species
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
data class Species(
        @field:SerializedName("id") val id: String,
        @field:SerializedName("name") val name: String,
        @field:SerializedName("species") val species: String,
        @field:SerializedName("status") val status: String,
        @field:SerializedName("image") val image: String,
        @field:SerializedName("photo") val photo: Photo
)
