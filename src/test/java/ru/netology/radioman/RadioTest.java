package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(150);

        double expected = 0, actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
}