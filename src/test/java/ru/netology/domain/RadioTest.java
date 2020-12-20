package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @ParameterizedTest(name = "{index} {0}")
    @CsvSource({"set CurrentRadioStation < firstRadioStation, -1, 0",
      "set CurrentRadioStation = firstRadioStation, 0, 0",
      "set firstRadioStation < CurrentRadioStation < lastRadioStation, 3, 3",
      "set CurrentRadioStation = lastRadioStation, 9, 9",
      "set CurrentRadioStation > lastRadioStation, 10, 0"})
    void setCurrentRadioStationTest(String testName, int currentRadioStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest(name = "{index} {0}")
    @CsvSource({"set volume < minVolume, -1, 0",
      "set volume = minVolume, 0, 0",
      "set minVolume < volume < maxVolume, 3, 3",
      "set volume = maxVolume, 10, 10",
      "set volume > maxVolume, 11, 0"})
    void setVolumeTest(String testName, int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(currentVolume);
        assertEquals(expected, radio.getVolume());
    }

    @ParameterizedTest(name = "{index} {0}")
    @CsvSource({"switch next from 1 station, 1, 2",
      "switch next from 9 station, 9, 0"})
    void nextStationTest(String testName, int currentRadioStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest(name = "{index} {0}")
    @CsvSource({"switch prev from 3 station, 3, 2",
      "switch prev from 0 station, 0, 9"})
    void prevStationTest(String testName, int currentRadioStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest(name = "{index} {0}")
    @CsvSource({"turn up the volume from 3, 3, 4",
      "turn up the volume from 10, 10, 10"})
    void turnUpVolumeTest (String testName, int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(currentVolume);
        radio.turnUpVolume();
        assertEquals(expected, radio.getVolume());
    }

    @ParameterizedTest(name = "{index} {0}")
    @CsvSource({"turn down the volume from 3, 3, 2",
      "turn down the volume from 0, 0, 0"})
    void turnDownVolumeTest (String testName, int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(currentVolume);
        radio.turnDownVolume();
        assertEquals(expected, radio.getVolume());
    }
}
