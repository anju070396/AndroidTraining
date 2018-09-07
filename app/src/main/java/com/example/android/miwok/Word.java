package com.example.android.miwok;

public class Word {

    private String mDefaultTraslation;
    private String mMiwokTraslation;

    public Word(String DefaultTraslation, String MiwokTraslation)
    {
        mDefaultTraslation = DefaultTraslation;
        mMiwokTraslation = MiwokTraslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTraslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTraslation;
    }
}
