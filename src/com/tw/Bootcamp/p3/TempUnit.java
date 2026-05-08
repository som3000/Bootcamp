package com.tw.Bootcamp.p3;

public enum TempUnit {
  CELSIUS {
    public double toBaseUnit(double celsius){
      return celsius + 273.15;
    }
  },
  FAHRENHEIT {
    public double toBaseUnit(double fahrenheit){
      return (fahrenheit - 32) * 5 / 9 + 273.15;
    }
  };

  public abstract double toBaseUnit(double measure);
}
