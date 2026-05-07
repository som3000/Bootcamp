package com.tw.Bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
  void Area(){
      Coordinate bottomLeft = new Coordinate(2,2);
      Coordinate topRight  = new Coordinate(5,5);
      Rectangle rectangle  = new Rectangle(bottomLeft, topRight);
      assertEquals(9, rectangle.area());
  }

  @Test
  void Perimeter(){
    Coordinate bottomLeft = new Coordinate(2,2);
    Coordinate topRight  = new Coordinate(5,5);
    Rectangle rectangle  = new Rectangle(bottomLeft, topRight);
    assertEquals(12, rectangle.perimeter());
  }

}