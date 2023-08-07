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

    @Test
// new
    void setCurrentStationCheck() {
        Radio station = new Radio();

        station.setCurrentStation(-1);
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
// new
    void setCurrentVolumeCheck() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-20);
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
// new
    void ifNextStationIsMaxRadio() {
        Radio next = new Radio();

        next.setCurrentStation(9);
        next.nextStation();
        int expected = 0;
        int actual = next.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
// new
    void ifPrevStationIsMinRadio() {
        Radio prev = new Radio();

        prev.setCurrentStation(0);
        prev.prevStation();
        int expected = 9;
        int actual = prev.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
// new
    void increaseVolumeForMaxRadio() {
        Radio increase = new Radio();

        increase.setCurrentVolume(100);
        increase.increaseVolume();
        int expected = 100;
        int actual = increase.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
// new
    void decreaseVolumeForMinRadio() {
        Radio decrease = new Radio();

        decrease.setCurrentVolume(0);
        decrease.decreaseVolume();
        int expected = 0;
        int actual = decrease.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
// new
    void setCurrentStationCheckOverMax() {
        Radio station = new Radio();

        station.setCurrentStation(12);
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
// new
    void setCurrentVolumeCheckOverMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(110);
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // на пулл реквест
    @Test
    void ifGetMaxStationRadio() {
        Radio ifGetMax = new Radio();

        ifGetMax.getMaxStationRadio();
        int expected = 9;
        int actual = ifGetMax.getMaxStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ifGetMinStationRadio() {
        Radio ifGetMin = new Radio();

        ifGetMin.getMinStationRadio();
        int expected = 0;
        int actual = ifGetMin.getMinStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ifGetMaxVolumeRadio() {
        Radio ifGetMaxV = new Radio();

        ifGetMaxV.getMaxVolumeRadio();
        int expected = 100;
        int actual = ifGetMaxV.getMaxVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ifGetMinVolumeRadio() {
        Radio ifGetMinV = new Radio();

        ifGetMinV.getMinVolumeRadio();
        int expected = 0;
        int actual = ifGetMinV.getMinVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkAmountOfStations() {
        Radio amountCheck = new Radio(10);
        int expected = 10;
    }

}

