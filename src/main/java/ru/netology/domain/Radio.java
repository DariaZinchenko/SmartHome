package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int volume;

    private int firstRadioStation = 0;
    private int lastRadioStation = 9;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < firstRadioStation){
            return;
        }
        if (currentRadioStation > lastRadioStation){
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

    public void nextStation() {
        if (currentRadioStation == lastRadioStation){
            this.setCurrentRadioStation(firstRadioStation);
        } else {
            this.setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prevStation() {
        if (currentRadioStation == firstRadioStation){
            this.setCurrentRadioStation(lastRadioStation);
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
