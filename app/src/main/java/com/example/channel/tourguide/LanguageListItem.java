package com.example.channel.tourguide;

/**
 * Created by Channel on 01-07-2018.
 */

public class LanguageListItem
{
    private String englishTranslation,teluguTranslation;
    private int audioResourceIdMaleSlow,audioResourceIdMaleFast;
    private int audioResourceIdFemaleSlow,audioResourceIdFemaleFast;

    LanguageListItem(String englishTranslation,String teluguTranslation,int audioResourceIdMaleFast,int audioResourceIdMaleSlow,
                    int audioResourceIdFemaleFast,int audioResourceIdFemaleSlow)
    {
        this.englishTranslation=englishTranslation;
        this.teluguTranslation=teluguTranslation;
        this.audioResourceIdMaleFast=audioResourceIdMaleFast;
        this.audioResourceIdMaleSlow=audioResourceIdMaleSlow;
        this.audioResourceIdFemaleFast=audioResourceIdFemaleFast;
        this.audioResourceIdFemaleSlow=audioResourceIdFemaleSlow;
    }


    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public String getTeluguTranslation() {
        return teluguTranslation;
    }

    public int getAudioResourceIdMaleSlow() {
        return audioResourceIdMaleSlow;
    }

    public int getAudioResourceIdMaleFast() {
        return audioResourceIdMaleFast;
    }

    public int getAudioResourceIdFemaleSlow() {
        return audioResourceIdFemaleSlow;
    }

    public int getAudioResourceIdFemaleFast() {
        return audioResourceIdFemaleFast;
    }
}
