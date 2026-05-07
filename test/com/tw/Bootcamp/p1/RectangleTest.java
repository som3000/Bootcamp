package com.tw.Bootcamp.p1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
  void ShouldCalculateTheAreaForRectangle(){
      Coordinate bottomLeft = new Coordinate(2,2);
      Coordinate topRight  = new Coordinate(5,5);
      Rectangle rectangle  = Rectangle.createRectangle(bottomLeft, topRight);

      assertEquals(9, rectangle.area());
  }

  @Test
  void ShouldCalculateThePerimeterForRectangle(){
    Coordinate bottomLeft = new Coordinate(2,2);
    Coordinate topRight  = new Coordinate(5,5);
    Rectangle rectangle  = Rectangle.createRectangle(bottomLeft, topRight);

    assertEquals(12, rectangle.perimeter());
  }

  @Test
  void ShouldCalculateTheAreaForSquare() {
    Coordinate bottomLeft = new Coordinate(2, 2);
    Coordinate topRight = new Coordinate(5, 5);
    Rectangle square = Rectangle.createSquare(bottomLeft, topRight);

    assertEquals(9, square.area());
  }

  @Test
  void ShouldCalculateThePerimeterForSquare() {
    Coordinate bottomLeft = new Coordinate(2, 2);
    Coordinate topRight = new Coordinate(5, 5);
    Rectangle square = Rectangle.createSquare(bottomLeft, topRight);

    assertEquals(12, square.perimeter());
  }

}