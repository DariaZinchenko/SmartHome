package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ConditionerAdvancedTest {

    @Test
    public void shouldCheckField() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        String expected = "Exp";

        assertNull(conditioner.getName());
        conditioner.setName("Exp");
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldChangeField() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        int expected = 20;

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(expected);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @ParameterizedTest(name = "{index} {0}")
    @CsvSource({"set currentTemperature < minTemperature, 14, 0",
      "set currentTemperature = minTemperature, 15, 15",
      "set minTemperature < currentTemperature < maxTemperature, 20, 20",
      "set currentTemperature = maxTemperature, 35, 35",
      "set currentTemperature > maxTemperature, 36, 0"})
    public void setCurrentTemperatureTest(String testName, int currentTemperature, int expected) {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(35);

        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}
