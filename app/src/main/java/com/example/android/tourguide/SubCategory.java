package com.example.android.tourguide;

public class SubCategory {

    private final int mImageResourceId;
    private String mDescription;

    private String mName;

    private int mImageResourceIdGo = NO_IMAGE_PROVIDED;

    //Constant value that represents no image
    private static final int NO_IMAGE_PROVIDED = -1;

    //Create a new SubCategory object.
    public SubCategory(String description, String name, int imageResourceId, int imageResourceIdGo) {
        mDescription = description;
        mName = name;
        mImageResourceId = imageResourceId;
        mImageResourceIdGo = imageResourceIdGo;

    }

    //Create a new SubCategory object + image.
    public SubCategory(String description, String name, int imageResourceId) {
        mDescription = description;
        mName = name;
        mImageResourceId = imageResourceId;
    }

    //Get the description.
    String getmDescription() {
        return mDescription;
    }

    //Get the name.
    String getmName() {
        return mName;
    }

    //Return the image resource ID
    int getImageResourceId() {
        return mImageResourceId;
    }

    //Return the imageGo resource ID
    int getImageResourceIdGo() {
        return mImageResourceIdGo;
    }

    //Returns whether or not there is an image.
    boolean hasImage() {
        return mImageResourceIdGo != NO_IMAGE_PROVIDED;
    }
}