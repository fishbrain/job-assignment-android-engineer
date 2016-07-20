package com.fishbrain.android.domain;


import com.google.gson.annotations.SerializedName;

import java.util.Calendar;
import java.util.List;

/**
 * This is the POJO for catches
 *
 * Created by dimitris.lachanas on 22/08/15.
 *
 */
public class Catch {

    @SerializedName("type")
    String mType;

    @SerializedName("id")
    int mId;

    @SerializedName("description")
    String mDescription;

    @SerializedName("caught_at_local_time_zone")
    Calendar mDateCaughtLocal;

    @SerializedName("caught_at_gmt")
    Calendar mDateCaught;

    @SerializedName("weight")
    double mWeight;

    @SerializedName("length")
    double mLength;

    @SerializedName("created_at")
    Calendar mDateCreated;

    @SerializedName("owner")
    Owner mOwner;

    @SerializedName("species")
    Species mSpecies;

    @SerializedName("photos")
    List<PhotoContainer> mPhotoContainers;

    @SerializedName("method")
    private Method mMethod;

    public Catch(String type, int id, String description, Calendar dateCaught, double weight, double length, Calendar dateCreated,
                 Owner owner, Species species, List<PhotoContainer> photoContainers) {
        mType = type;
        mId = id;
        mDescription = description;
        mDateCaught = dateCaught;
        mWeight = weight;
        mLength = length;
        mDateCreated = dateCreated;
        mOwner = owner;
        mSpecies = species;
        mPhotoContainers = photoContainers;
    }

    public String getType() {
        return mType;
    }

    public int getId() {
        return mId;
    }

    public String getDescription() {
        return mDescription;
    }

    public Calendar getDateCaught() {
        return mDateCaught;
    }

    public Calendar getDateCaughtLocal() {
        return mDateCaughtLocal;
    }

    public double getWeight() {
        return mWeight;
    }

    public double getLength() {
        return mLength;
    }

    public Calendar getDateCreated() {
        return mDateCreated;
    }

    public Owner getOwner() {
        return mOwner;
    }

    public Species getSpecies() {
        return mSpecies;
    }

    public List<PhotoContainer> getPhotoContainers() {
        return mPhotoContainers;
    }

    public Method getMethod() {
        return mMethod;
    }

}
