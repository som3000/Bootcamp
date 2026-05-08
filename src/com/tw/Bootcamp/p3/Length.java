package com.tw.Bootcamp.p3;

import java.util.Objects;

public class Length {
  private final double length;
  private final Unit unit;

  public Length(double length, Unit unit) {
    this.length = length;
    this.unit = unit;
  }

  public Length add(Length other) {
    return new Length(this.length + other.length, Unit.INCHES);
  }

  public static Length createFeet(double ft) throws InvalidMeasure {
    validateMeasurement(ft);

    return new Length(Unit.FEET.inBaseUnits(ft), Unit.FEET);
  }
  public static Length createCm(double cm) throws InvalidMeasure {
    validateMeasurement(cm);

    return new Length(Unit.CENTIMETRE.inBaseUnits(cm), Unit.CENTIMETRE);
  }

  public static Length createInches(double in) throws InvalidMeasure {
    validateMeasurement(in);

    return new Length(Unit.INCHES.inBaseUnits(in), Unit.INCHES);
  }

  public static Length createMm(double mm) throws InvalidMeasure {
    validateMeasurement(mm);

    return new Length(Unit.MILLIMETRE.inBaseUnits(mm), Unit.MILLIMETRE);
  }

  private static void validateMeasurement(double measure) throws InvalidMeasure {
    if (measure < 0) {
      throw new InvalidMeasure("Invalid Measurement");
    }
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Length other)) return false;

    return Math.abs(length- other.length) <= 0.1;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(length);
  }

}
