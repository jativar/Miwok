package com.example.android.miwok;

/**
 * {@link Family} represents a vocabulary word that the user wants to learn
 *  It contains a default translation and a Miwok translation for that word
 */

public class Family {

    /** Default translation for the family */
    private String mDefaultTranslation;

    /** Miwok translation for the family */
    private String mMiwokTranslation;

    /** Miwok Drawable resource ID */
    private int mImageResourceId;

    /** Add the constructor
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId
     * */
    public Family(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the family.
     */
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get Miwok translation of the family.
     */
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * Get the image resource ID
     */
    public int getmImageResourceId() { return mImageResourceId; }
}