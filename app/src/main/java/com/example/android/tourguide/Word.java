package com.example.android.tourguide;

public class Word {

    /** Image for the particular item */
    private int mImageResourceId;

    /** Description for the item */
    private String mDescriptionOfImage;

    /** Name to describe the image */
    private String mNameOfImage;

    /**
     * Create a new Item object.
     *
     * @param descriptionOfImage is the description for the particular item/image
     * @param nameOfImage is the name of the particular image
     * @param imageResourceId is the image for the particular item name/description
     */
    public Word(String nameOfImage, String descriptionOfImage, int imageResourceId) {
        mNameOfImage = nameOfImage;
        mDescriptionOfImage = descriptionOfImage;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the image of the item.
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Get the name of the image.
     */
    public String getNameOfImage() {
        return mNameOfImage;
    }

    /**
     * Get the description of the item/image.
     */
    public String getDescriptionOfImage() {
        return mDescriptionOfImage;
    }

}
