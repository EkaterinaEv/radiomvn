package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void setCurrentStation() {
        Radio station = new Radio();

        station.setCurrentStation(8);
        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);
        int expected = 50;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationRadio() {
        Radio next = new Radio();

        next.setCurrentStation(5);
        next.nextStation();
        int expected = 6;
        int actual = next.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationRadio() {
        Radio prev = new Radio();

        prev.setCurrentStation(5);
        prev.prevStation();
        int expected = 4;
        int actual = prev.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeRadio() {
        Radio increase = new Radio();

        increase.setCurrentVolume(85);
        increase.increaseVolume();
        int expected = 86;
        int actual = increase.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeRadio() {
        Radio decrease = new Radio();

        decrease.setCurrentVolume(85);
        decrease.decreaseVolume();
        int expected = 84;
        int actual = decrease.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

