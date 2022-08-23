package ru.netology.radioman;

public class Radio {
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0)
            currentRadioStation = 9;
        if (currentRadioStation > 9)
            currentRadioStation = 0;
        this.currentRadioStation= currentRadioStation;
    }

    public void setNextRadioStation() {
        currentRadioStation++;
        setCurrentRadioStation(currentRadioStation);
    }

    public void setPreviousRadioStation() {
        currentRadioStation--;
        setCurrentRadioStation(currentRadioStation);
    }

    private int currentVolumeLevel;

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        if (currentVolumeLevel < 0)
            currentVolumeLevel = 0;
        if (currentVolumeLevel > 10)
            currentVolumeLevel = 10;
        this.currentVolumeLevel= currentVolumeLevel;
    }

    public void setVolumeLevelToMaximum() {
        setCurrentVolumeLevel(10);
    }

    public void setVolumeLevelToMinimum() {
        setCurrentVolumeLevel(0);
    }

    public void turnUpVolumeLevelByOne() {
        currentVolumeLevel++;
        setCurrentVolumeLevel(currentVolumeLevel);
    }

    public void turnDownVolumeLevelByOne() {
        currentVolumeLevel--;
        setCurrentVolumeLevel(currentVolumeLevel);
    }
}
