package com.tw.Bootcamp.p3;

public enum Unit {FEET (0.305),
  INCHES (0.0254),
  CENTIMETRE (0.01),
  MILLIMETRE (0.001),
  LITRE (1),
  GALLON (3.78);

  private final double conversionFactor;

  Unit(double conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  public double inBaseUnits(double measure){
    return this.conversionFactor * measure;
  }
}
