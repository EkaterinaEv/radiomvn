package ru.netology.radio;

public class Radio {
    private int maxStationRadio = 9;
    private int minStationRadio = 0;
    private int maxVolumeRadio = 100;
    private int minVolumeRadio = 0;
    private int amountOfStations = 10;
    private int currentStation = minStationRadio;
    private int currentVolume = minVolumeRadio;

    /// ДОРАБОТКА
    public Radio(int amountOfStations) {

        this.maxStationRadio = amountOfStations-1;
    }
    /// ДОРАБОТКА
    public Radio() {
        this.maxStationRadio = 9;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxStationRadio() {
        return maxStationRadio;
    }

    public int getMinStationRadio() {
        return minStationRadio;
    }

    public int getMaxVolumeRadio() {
        return maxVolumeRadio;
    }

    public int getMinVolumeRadio() {
        return minVolumeRadio;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStationRadio) {
            return;
        }
        if (newCurrentStation > maxStationRadio) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolumeRadio) {
            return;
        }
        if (newCurrentVolume > maxVolumeRadio) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    // добавляем методы
    public void nextStation() {
        if (currentStation == maxStationRadio) {
            currentStation = minStationRadio;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == minVolumeRadio) {
            currentStation = maxStationRadio;
        } else {
            currentStation = currentStation - 1;
        }

    }

    public void increaseVolume() {
        if (currentVolume < maxVolumeRadio) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolumeRadio;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolumeRadio) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolumeRadio;
        }
    }
}

