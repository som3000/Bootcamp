package com.tw.Bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

  @Test
  void ShouldCalculateTheDxBetweenPoints() {
    Coordinate bottomLeft = new Coordinate(2,2);
    Coordinate topRight  = new Coordinate(5,5);
    assertEquals(3, bottomLeft.dx(topRight));
  }

  @Test
  void ShouldCalculateTheDyBetweenPoints() {
    Coordinate bottomLeft = new Coordinate(2,2);
    Coordinate topRight  = new Coordinate(5,5);

    assertEquals(3, bottomLeft.dy(topRight));
  }
}
