package com.tw.Bootcamp.p3;

public enum VolumeUnit {
  LITRE (1),
  GALLON (3.78);

  private final double conversionFactor;

  VolumeUnit(double conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  public double inBaseUnits(double measure){
    return this.conversionFactor * measure;
  }
}
