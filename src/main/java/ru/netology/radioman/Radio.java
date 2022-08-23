package ru.netology.radioman;

public class Radio {
    private double currentRadioStation;

    public double getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(double currentRadioStation) {
        if (currentRadioStation < 0)
            currentRadioStation = 9;
        if (currentRadioStation > 9)
            currentRadioStation = 0;
        this.currentRadioStation= currentRadioStation;
    }

    private int currentVolumeLevel;

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        if (currentVolumeLevel < 0)
            return;
        if (currentVolumeLevel > 10)
            return;
        this.currentVolumeLevel= currentVolumeLevel;
    }

    public void setVolumeLevelToMaximum() {
        currentVolumeLevel = 10;
    }

    public void setVolumeLevelToMinimum() {
        currentVolumeLevel = 0;
    }
}
