package com.tw.Bootcamp.p1;

public class Rectangle {

  private final Coordinate bottomLeft;
  private final Coordinate topRight;

  public Rectangle(Coordinate bottomLeft, Coordinate topRight) {
    this.bottomLeft = bottomLeft;
    this.topRight = topRight;
  }

  public int area() {
    return bottomLeft.breadth(topRight) * bottomLeft.length(topRight);
  }

  public int perimeter() {
    return 2 * (bottomLeft.breadth(topRight) + bottomLeft.length(topRight));
  }
}
