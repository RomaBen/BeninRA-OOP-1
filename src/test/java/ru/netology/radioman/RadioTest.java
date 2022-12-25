package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test void testSetCurrentRadioStationToMaximum () {
        radio.setCurrentRadioStationToMaximum();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test void testSetCurrentRadioStationToMinimum() {
        radio.setCurrentRadioStationToMinimum();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void testGetMaximumRadioStation() {
        assertEquals(9, radio.getMaximumRadioStation());
    }

    @Test
    public void testGetMinimumRadioStation() {
        assertEquals(0, radio.getMinimumRadioStation());
    }

    @Test
    public void testGetNumberOfRadioStations() {
        assertEquals(10, radio.getNumberOfRadioStations());
    }
    @Test
    public void testGetCurrentRadioStation() {
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void testSetCurrentRadioStationMoreThanLimit() {
        radio.setCurrentRadioStation(11);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void testSetCurrentRadioStationInLimits() {
        radio.setCurrentRadioStation(7);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void testSetCurrentRadioStationLessThanLimit() {
        radio.setCurrentRadioStation(-1);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void testSetNextRadioStationInLimits() {
        radio.setNextRadioStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void testSetNextRadioStationMoreThanLimit() {
        radio.setCurrentRadioStationToMaximum();
        radio.setNextRadioStation();
        int expected = 0, actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPreviousRadioStationInLimits() {
        radio.setPreviousRadioStation();
        int expected = 4, actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPreviousRadioStationLessThanLimit() {
        radio.setCurrentRadioStationToMinimum();
        radio.setPreviousRadioStation();
        int expected = 9, actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCurrentVolumeLevel() {
        int expected = 50, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeLevelInLimits() {
        radio.setCurrentVolumeLevel(5);
        int expected = 5, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeLevelMoreThanLimit() {
        radio.setCurrentVolumeLevel(101);
        int expected = 100, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeLevelLessThanLimit() {
        radio.setCurrentVolumeLevel(-1);
        int expected = 0, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMaximumVolumeLevel() {
        assertEquals(100, radio.getMaximumVolumeLevel());
    }

    @Test
    public void testGetMinimumVolumeLevel() {
        assertEquals(0, radio.getMinimumVolumeLevel());
    }

    @Test
    public void testSetVolumeLevelToMaximum() {
        radio.setVolumeLevelToMaximum();
        int expected = 100, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeLevelToMinimum() {
        radio.setVolumeLevelToMinimum();
        int expected = 0, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testTurnUpVolumeLevelByOneInLimits() {
        radio.turnUpVolumeLevelByOne();
        int expected = 51, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testTurnUpVolumeLevelByOneMoreThanLimit() {
        radio.setVolumeLevelToMaximum();
        radio.turnUpVolumeLevelByOne();
        int expected = 100, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testTurnDownVolumeLevelByOneInLimits() {
        radio.turnDownVolumeLevelByOne();
        int expected = 49, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testTurnDownVolumeLevelByOneLessThanLimit() {
        radio.setVolumeLevelToMinimum();
        radio.turnDownVolumeLevelByOne();
        int expected = 0, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    Radio radioFlex = new Radio(15);

    @Test void testSetCurrentRadioStationToMaximumFlex () {
        radioFlex.setCurrentRadioStationToMaximum();
        assertEquals(14, radioFlex.getCurrentRadioStation());
    }

    @Test void testSetCurrentRadioStationToMinimumFlex() {
        radioFlex.setCurrentRadioStationToMinimum();
        assertEquals(0, radioFlex.getCurrentRadioStation());
    }

    @Test
    public void testGetMaximumRadioStationFlex() {
        assertEquals(14, radioFlex.getMaximumRadioStation());
    }

    @Test
    public void testGetMinimumRadioStationFlex() {
        assertEquals(0, radioFlex.getMinimumRadioStation());
    }

    @Test
    public void testGetNumberOfRadioStationsFlex() {
        assertEquals(15, radioFlex.getNumberOfRadioStations());
    }
    @Test
    public void testGetCurrentRadioStationFlex() {
        assertEquals(5, radioFlex.getCurrentRadioStation());
    }

    @Test
    public void testSetCurrentRadioStationMoreThanLimitFlex() {
        radioFlex.setCurrentRadioStation(15);
        assertEquals(5, radioFlex.getCurrentRadioStation());
    }

    @Test
    public void testSetCurrentRadioStationInLimitsFlex() {
        radioFlex.setCurrentRadioStation(10);
        assertEquals(10, radioFlex.getCurrentRadioStation());
    }

    @Test
    public void testSetCurrentRadioStationLessThanLimitFlex() {
        radioFlex.setCurrentRadioStation(-1);
        assertEquals(5, radioFlex.getCurrentRadioStation());
    }

    @Test
    public void testSetNextRadioStationInLimitsFlex() {
        radioFlex.setNextRadioStation();
        assertEquals(6, radioFlex.getCurrentRadioStation());
    }

    @Test
    public void testSetNextRadioStationMoreThanLimitFlex() {
        radioFlex.setCurrentRadioStationToMaximum();
        radioFlex.setNextRadioStation();
        int expected = 0, actual = radioFlex.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPreviousRadioStationInLimitsFlex() {
        radioFlex.setPreviousRadioStation();
        int expected = 4, actual = radioFlex.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPreviousRadioStationLessThanLimitFlex() {
        radioFlex.setCurrentRadioStationToMinimum();
        radioFlex.setPreviousRadioStation();
        int expected = 14, actual = radioFlex.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
}