package com.svanberggroup.beatbox;

public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String fileName = components[components.length - 1];
        mName = fileName.replace(".wav", "" );
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public String getName() {
        return mName;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
