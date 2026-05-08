package com.tw.Bootcamp.p3;

import java.util.Objects;

public class Length {
  private final double length;
  private final LengthUnit lengthUnit;

  public Length(double length, LengthUnit lengthUnit) {
    this.length = length;
    this.lengthUnit = lengthUnit;
  }

  public Length add(Length other) {
    return new Length(this.length + other.length, LengthUnit.INCHES);
  }

  public static Length createFeet(double ft) throws InvalidMeasure {
    validateMeasurement(ft);

    return new Length(LengthUnit.FEET.inBaseUnits(ft), LengthUnit.FEET);
  }
  public static Length createCm(double cm) throws InvalidMeasure {
    validateMeasurement(cm);

    return new Length(LengthUnit.CENTIMETRE.inBaseUnits(cm), LengthUnit.CENTIMETRE);
  }

  public static Length createInches(double in) throws InvalidMeasure {
    validateMeasurement(in);

    return new Length(LengthUnit.INCHES.inBaseUnits(in), LengthUnit.INCHES);
  }

  public static Length createMm(double mm) throws InvalidMeasure {
    validateMeasurement(mm);

    return new Length(LengthUnit.MILLIMETRE.inBaseUnits(mm), LengthUnit.MILLIMETRE);
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
