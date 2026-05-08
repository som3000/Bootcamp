package com.tw.Bootcamp.p3;

import java.util.Objects;

public class Volume {
  private final double volume;

  public Volume(double volume) {
    this.volume = volume;
  }

  public static Volume createLitre(double litre) throws InvalidMeasure {
    validateMeasurement(litre);

    return new Volume(litre);
  }

  public static Volume createGallon(double gal) throws InvalidMeasure {
    validateMeasurement(gal);

    return new Volume(gal * 3.78);
  }

  private static void validateMeasurement(double measure) throws InvalidMeasure {
    if (measure < 0) {
      throw new InvalidMeasure("Invalid Measurement");
    }
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Volume other)) return false;
    return Math.abs(volume- other.volume) <= 0.1;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(volume);
  }
}
