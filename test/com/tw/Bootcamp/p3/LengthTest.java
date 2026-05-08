package com.tw.Bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

  @Test
  void shouldCompareFeetWithInches() throws InvalidMeasure {
    final Length feet = Length.createFeet(1.0);
    final Length inch = Length.createInches(12.0);

    assertEquals(feet, inch);
  }

  @Test
  void shouldCompareInchesWithCm() throws InvalidMeasure {
    final Length inch = Length.createInches(2);
    final Length cm = Length.createCm(5.08);

    assertEquals(inch, cm);
  }

  @Test
  void shouldCompareCmWithMm() throws InvalidMeasure {
    final Length cm = Length.createCm(1);
    final Length mm = Length.createMm(10);

    assertEquals(cm, mm);
    assertEquals(cm.hashCode(), mm.hashCode());
  }

  @Test
  void shouldThrowErrorOnInvalidMeasurementCreation() throws InvalidMeasure {
    assertThrows(InvalidMeasure.class, () -> Length.createCm(-1));
    assertThrows(InvalidMeasure.class, () -> Length.createMm(-5));
    assertThrows(InvalidMeasure.class, () -> Length.createFeet(-10));
    assertThrows(InvalidMeasure.class, () -> Length.createInches(-2));
  }


  @Test
  void shouldReturnFalseOnInvalidComparison() throws InvalidMeasure {
    final Length cm = Length.createCm(1);
    final Volume gal = Volume.createGallon(1);

    assertNotEquals(gal, cm);
  }

  @Test
  void shouldAddTwoSimilarLengths() throws InvalidMeasure {
    final Length oneInch = Length.createInches(1);
    final Length twoInches = Length.createInches(2);

    final Length threeInches = Length.createInches(3);

    assertEquals(threeInches, oneInch.add(twoInches));
  }

  @Test
  void shouldAddTwoDistinctLengths() throws InvalidMeasure {
    final Length inch = Length.createInches(2);
    final Length cm = Length.createCm(2.5);

    final Length threeInches = Length.createInches(3);

    assertEquals(threeInches, inch.add(cm));
  }
}