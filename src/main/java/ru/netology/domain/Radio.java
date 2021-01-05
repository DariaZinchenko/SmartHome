package ru.netology.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Radio {
    @Getter private int currentRadioStation;
    @Getter private int volume;

    @Getter private int numberOfRadioStation = 10;
    @Getter private int minVolume = 0;
    @Getter private int maxVolume = 100;

    public Radio(int numberOfRadioStation) {
        if (numberOfRadioStation < 0){
            this.numberOfRadioStation = 0;
            return;
        }

        this.numberOfRadioStation = numberOfRadioStation;
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
