package com.tw.Bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TemperatureTest {

  @Test
  void ShouldCompareFahrenheitWithCelsius() throws InvalidMeasure {
    final Temperature fahrenheit = Temperature.createFahrenheit(212);
    final Temperature celsius = Temperature.createCelsius(100);

    assertEquals(fahrenheit, celsius);
    assertEquals(fahrenheit.hashCode(), celsius.hashCode());
  }

  @Test
  void shouldReturnFalseOnInvalidComparison() throws InvalidMeasure {
    final Temperature fahrenheit = Temperature.createFahrenheit(212);
    final Temperature celsius = Temperature.createCelsius(104);

    assertNotEquals(fahrenheit, celsius);
  }
}