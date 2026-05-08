package com.tw.Bootcamp.p3;

public enum LengthUnit {
  FEET (0.305),
  INCHES (0.0254),
  CENTIMETRE (0.01),
  MILLIMETRE (0.001);

  private final double conversionFactor;

  LengthUnit(double conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  public double inBaseUnits(double measure){
    return this.conversionFactor * measure;
  }
}
