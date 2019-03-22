package com.example.android.miwok;
public class Word {
    private int imageResourceId;
    private String defaultTranslate;
    private String MiwokTranslate;
    private int audioRescourceId;
    private boolean imageSetted = false;
    public Word (String defaultTranslate,String MiwokTranslate,int audioRescourceId){
        this.MiwokTranslate = MiwokTranslate;
        this.defaultTranslate = defaultTranslate;
        this.audioRescourceId = audioRescourceId;
    }
    public Word (String defaultTranslate,String MiwokTranslate, int imageResourceId, int audioRescourceId){
        this.MiwokTranslate = MiwokTranslate;
        this.defaultTranslate = defaultTranslate;
        this.imageResourceId = imageResourceId;
        imageSetted = true;
        this.audioRescourceId = audioRescourceId;
    }
    public String getDefaultTranslate() {
        return defaultTranslate;
    }

    public String getMiwokTranslate() {
        return MiwokTranslate;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageSetted;
    }

    public int getAudioRescourceId() {
        return audioRescourceId;
    }

}
