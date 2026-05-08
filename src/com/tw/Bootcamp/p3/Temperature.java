package com.tw.Bootcamp.p3;

import java.util.Objects;

public class Temperature {
  private final double temperature;
  private final TempUnit unit;

  public Temperature(double temperature, TempUnit unit) {
    this.temperature = temperature;
    this.unit = unit;
  }

  public Temperature add(Temperature other) {
    return new Temperature(this.temperature + other.temperature, this.unit);
  }

  public static Temperature createCelsius(double celsius) throws InvalidMeasure {
    validateMeasurement(celsius);

    return new Temperature(TempUnit.CELSIUS.toBaseUnit(celsius), TempUnit.CELSIUS);
  }

  public static Temperature createFahrenheit(double fahrenheit) throws InvalidMeasure {
    validateMeasurement(fahrenheit);

    return new Temperature(TempUnit.FAHRENHEIT.toBaseUnit(fahrenheit), TempUnit.FAHRENHEIT);
  }

  private static void validateMeasurement(double measure) throws InvalidMeasure {
    if (measure < 0) {
      throw new InvalidMeasure("Invalid Measurement");
    }
  }


  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Temperature other)) return false;

    return Math.abs(temperature- other.temperature) <= 0.1;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(temperature);
  }
}
