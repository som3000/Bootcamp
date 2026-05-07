package com.tw.Bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

  @Test
  void ShouldCalculateTheAreaForSquare() {
    Coordinate bottomLeft = new Coordinate(2, 2);
    Coordinate topRight = new Coordinate(5, 5);
    Square square = new Square(bottomLeft, topRight);

    assertEquals(9, square.area());
  }

  @Test
  void ShouldCalculateThePerimeterForSquare() {
    Coordinate bottomLeft = new Coordinate(2, 2);
    Coordinate topRight = new Coordinate(5, 5);
    Square square = new Square(bottomLeft, topRight);

    assertEquals(12, square.perimeter());
  }

}