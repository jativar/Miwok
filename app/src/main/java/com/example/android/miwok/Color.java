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

    /** Add the constructor */
    public Color(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
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
}