package com.example.android.tourguideapp;

/**
 * Created by chris_skart on 07/02/2017.
 */
public class Place {

    private static final int NO_IMAGE_PROVIDED = -1;
    //image source ID
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    //Name of the place
    private String mPlace;
    //Description of the place
    private String mDescription;


    //Place constructor
    public Place(String place, String description) {
        //mImageResourceID = imageResourceID;
        mDescription = description;
        mPlace = place;
    }

    @Override
    public String toString() {
        return "Place{" +
                "mImageResourceID=" + mImageResourceID +
                ",mPlace=" + mPlace + '\'' +
                ",mDescription=" + '}';

    }

    //Getters for image, place and description
    public int getImageResourceID() {return mImageResourceID;}
    public String getPlace() {return mPlace;}
    public String getDescription() {return mDescription;}
    public boolean hasImage(){return mImageResourceID != NO_IMAGE_PROVIDED;}
}


