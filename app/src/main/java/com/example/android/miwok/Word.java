package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn
 *  It contains a default translation and a Miwok translation for that word
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Miwok Drawable resource ID */
    private int mImageResourceId;

    /** Add the constructor
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId
     * */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
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
