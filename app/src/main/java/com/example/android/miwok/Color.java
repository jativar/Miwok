package com.example.android.miwok;

/**
 * {@link Color} represents a vocabulary word that the user wants to learn
 *  It contains a default translation and a Miwok translation for that word
 */

public class Color {

    /** Default translation for the color */
    private String mDefaultTranslation;

    /** Miwok translation for the color */
    private String mMiwokTranslation;

    /** Miwok Drawable resource ID */
    private int mImageResourceId;

    /** Add the constructor */
    public Color(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get Miwok translation of the word.
     */
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * Get the image resource ID
     */
    public int getmImageResourceId() { return mImageResourceId; }
    
}