package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int volume;

    private int numberOfRadioStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int numberOfRadioStation) {
        if (numberOfRadioStation < 0){
            this.numberOfRadioStation = 0;
            return;
        }

        this.numberOfRadioStation = numberOfRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0){
            return;
        }
        if (currentRadioStation > numberOfRadioStation - 1){
            return;
        }

        this.currentRadioStation = currentRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume){
            return;
        }
        if (volume > maxVolume){
            return;
        }

        this.volume = volume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getNumberOfRadioStation() {
        return numberOfRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation == numberOfRadioStation - 1){
            this.setCurrentRadioStation(0);
        } else {
            this.setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prevStation() {
        if (currentRadioStation == 0){
            this.setCurrentRadioStation(numberOfRadioStation - 1);
        } else {
            this.setCurrentRadioStation(currentRadioStation - 1);
        }

    }

    public void turnUpVolume() {
        if (volume == maxVolume){
            return;
        } else {
            this.setVolume(volume + 1);
        }
    }

    public void turnDownVolume() {
        if (volume == minVolume){
            return;
        } else {
            this.setVolume(volume - 1);
        }
    }
}
