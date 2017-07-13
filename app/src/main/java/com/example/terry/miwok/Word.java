package com.example.terry.miwok;

/**
 * Created by TERRY on 2017/07/06.
 */

public class Word {
    private String mDefaultTraslation;
    private String mMiwokTranlation;
    private int mImageResoursedId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;



    public Word(String defaultTranlstion,String miwokTranslation,int audioResources){
        mDefaultTraslation=defaultTranlstion;
        mMiwokTranlation=miwokTranslation;
        mAudioResourceId=audioResources;
    }
    public Word(String defaultTranlstion,String miwokTranslation,int imageResourceId,int audioResources){
        mDefaultTraslation=defaultTranlstion;
        mMiwokTranlation=miwokTranslation;
        mImageResoursedId=imageResourceId;
        mAudioResourceId=audioResources;
    }



    public String getmDefaultTraslation() {
        return mDefaultTraslation;
    }

    public String getmMiwokTranlation() {
        return mMiwokTranlation;
    }

    public int getmImageResoursedId() {
        return mImageResoursedId;
    }

        public boolean HasImage() {
            return mImageResoursedId != NO_IMAGE_PROVIDED;
        }
            public int getmAudioResourceId() {

                return mAudioResourceId;
            }



    }

