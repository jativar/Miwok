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

    /** Add the constructor */
    public Family(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
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
}