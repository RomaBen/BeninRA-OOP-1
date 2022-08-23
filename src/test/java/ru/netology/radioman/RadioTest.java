package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void testGetCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 0, actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentRadioStationMoreThanLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        int expected = 0, actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentRadioStationInLimits() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        int expected = 5, actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentRadioLessStationThanLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 9, actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNextRadioStationInLimits() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setNextRadioStation();
        int expected = 1, actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNextRadioStationMoreThanLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setNextRadioStation();
        int expected = 0, actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPreviousRadioStationInLimits() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setPreviousRadioStation();
        int expected = 8, actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPreviousRadioStationLessThanLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setPreviousRadioStation();
        int expected = 9, actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCurrentVolumeLevel() {
        Radio radio = new Radio();
        int expected = 0, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeLevelInLimits() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(5);
        int expected = 5, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeLevelMoreThanLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(11);
        int expected = 10, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeLevelLessThanLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(-1);
        int expected = 0, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeLevelToMaximum() {
        Radio radio = new Radio();
        radio.setVolumeLevelToMaximum();
        int expected = 10, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeLevelToMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(5);     // Данный метод здесь, чтобы setVolumeLevelToMinimum
        radio.setVolumeLevelToMinimum();    // не менял ноль на ноль
        int expected = 0, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testTurnUpVolumeLevelByOneInLimits() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(5);
        radio.turnUpVolumeLevelByOne();
        int expected = 6, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testTurnUpVolumeLevelByOneMoreThanLimit() {
        Radio radio = new Radio();
        radio.setVolumeLevelToMaximum();
        radio.turnUpVolumeLevelByOne();
        int expected = 10, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testTurnDownVolumeLevelByOneInLimits() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(5);
        radio.turnDownVolumeLevelByOne();
        int expected = 4, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testTurnDownVolumeLevelByOneLessThanLimit() {
        Radio radio = new Radio();
        radio.setVolumeLevelToMinimum();
        radio.turnDownVolumeLevelByOne();
        int expected = 0, actual = radio.getCurrentVolumeLevel();
        assertEquals(expected, actual);
    }
    //Test
}