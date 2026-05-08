package com.tw.Bootcamp.p3;

import java.util.Objects;

public class Volume {
  private final double volume;
  private final Unit unit;

  public Volume(double volume, Unit unit) {
    this.volume = volume;
    this.unit = unit;
  }

  public Volume add(Volume other) {
    return new Volume(this.volume + other.volume, this.unit);
  }

  public static Volume createLitre(double litre) throws InvalidMeasure {
    validateMeasurement(litre);

    return new Volume(Unit.LITRE.inBaseUnits(litre), Unit.LITRE);
  }

  public static Volume createGallon(double gal) throws InvalidMeasure {
    validateMeasurement(gal);

    return new Volume(Unit.GALLON.inBaseUnits(gal), Unit.GALLON);
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
