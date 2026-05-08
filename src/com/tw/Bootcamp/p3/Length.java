package com.tw.Bootcamp.p3;

import java.util.Objects;

public class Length {
  private final double length;

  public Length(double length) {
    this.length = length;
  }

  public static Length createFeet(double ft) throws InvalidMeasure {
    validateMeasurement(ft);

    return new Length(ft * 0.305);
  }
  public static Length createCm(double cm) throws InvalidMeasure {
    validateMeasurement(cm);

    return new Length(cm * 0.01);
  }

  public static Length createInches(double in) throws InvalidMeasure {
    validateMeasurement(in);

    return new Length(in * 0.0254);
  }

  private static void validateMeasurement(double measure) throws InvalidMeasure {
    if (measure < 0) {
      throw new InvalidMeasure("Invalid Measurement");
    }
  }

  public static Length createMm(double mm) throws InvalidMeasure {
    validateMeasurement(mm);

    return new Length(mm * 0.001);
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
