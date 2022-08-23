package ru.netology.radioman;

public class Radio {
    private double currentRadioStation;

    public double getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(double currentRadioStation) {
        if (currentRadioStation < 0)
            return;
        if (currentRadioStation > 9)
            return;
        this.currentRadioStation= currentRadioStation;
    }

    private int currentVolumeLevel;

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        if (currentVolumeLevel < 0)
            return;
        if (currentVolumeLevel > 100)
            return;
        this.currentVolumeLevel= currentVolumeLevel;
    }

    public void setVolumeLevelToMaximum() {
        currentVolumeLevel = 100;
    }

    public void setVolumeLevelToMinimum() {
        currentVolumeLevel = 0;
    }
}
