package ru.netology.radioman;

public class Radio {
    private int numberOfRadioStations = 10;
    private int maximumRadioStation = numberOfRadioStations - 1;
    private final int minimumRadioStation = 0;
    private int currentRadioStation = 5;
    private int currentVolumeLevel = 50;
    private final int maximumVolumeLevel = 100;
    private final int minimumVolumeLevel = 0;
    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
        this.maximumRadioStation = numberOfRadioStations - 1;
    }

    public Radio() {

    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public int getMaximumRadioStation() {
        return maximumRadioStation;
    }

    public int getMinimumRadioStation() {
        return minimumRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minimumRadioStation)
            return;
        if (currentRadioStation > maximumRadioStation)
            return;
        this.currentRadioStation= currentRadioStation;
    }

    public void setCurrentRadioStationToMaximum() {
        this.currentRadioStation = maximumRadioStation;
    }

    public void setCurrentRadioStationToMinimum() {
        this.currentRadioStation = minimumRadioStation;
    }

    public void setNextRadioStation() {
        currentRadioStation++;
        if (currentRadioStation < maximumRadioStation)
            setCurrentRadioStation(currentRadioStation);
        else
            setCurrentRadioStationToMinimum();
    }

    public void setPreviousRadioStation() {
        currentRadioStation--;
        if (currentRadioStation > minimumRadioStation)
            setCurrentRadioStation(currentRadioStation);
        else
            setCurrentRadioStationToMaximum();
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public int getMaximumVolumeLevel() {
        return maximumVolumeLevel;
    }

    public int getMinimumVolumeLevel() {
        return minimumVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        if (currentVolumeLevel < minimumVolumeLevel)
            currentVolumeLevel = minimumVolumeLevel;
        if (currentVolumeLevel > maximumVolumeLevel)
            currentVolumeLevel = maximumVolumeLevel;
        this.currentVolumeLevel= currentVolumeLevel;
    }

    public void setVolumeLevelToMaximum() {
        setCurrentVolumeLevel(maximumVolumeLevel);
    }

    public void setVolumeLevelToMinimum() {
        setCurrentVolumeLevel(minimumVolumeLevel);
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
