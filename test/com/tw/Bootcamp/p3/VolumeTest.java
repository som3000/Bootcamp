package com.tw.Bootcamp.p3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {

  @Test
  void ShouldCompareGallonWithLitres() throws InvalidMeasure {
    final Volume litre = Volume.createLitre(3.78);
    final Volume gal = Volume.createGallon(1);

    assertEquals(litre, gal);
    assertEquals(litre.hashCode(), gal.hashCode());
  }

  @Test
  void shouldThrowErrorOnInvalidMeasurementCreation() throws InvalidMeasure {
    assertThrows(InvalidMeasure.class, () -> Volume.createGallon(-1));
    assertThrows(InvalidMeasure.class, () -> Volume.createLitre(-5));
  }

  @Test
  void shouldReturnFalseOnInvalidComparison() throws InvalidMeasure {
    final Volume litre = Volume.createLitre(1);
    final Length ft = Length.createFeet(1);

    assertNotEquals(litre, ft);
  }
}