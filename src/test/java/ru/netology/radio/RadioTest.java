package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void averageStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void maxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void afterMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void afterMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageVolume() {
        Radio radio = new Radio();
        radio.setCerrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCerrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setCerrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCerrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setCerrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCerrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void aftreMinVolume() {
        Radio radio = new Radio();
        radio.setCerrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCerrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void afterMaxVolume() {
        Radio radio = new Radio();
        radio.setCerrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCerrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}