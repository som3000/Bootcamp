package com.tw.Bootcamp.p1;

public class Rectangle {

  private final Coordinate bottomLeft;
  private final Coordinate topRight;

  private Rectangle(Coordinate bottomLeft, Coordinate topRight) {
    this.bottomLeft = bottomLeft;
    this.topRight = topRight;
  }

  public int area() {
    return bottomLeft.dy(topRight) * bottomLeft.dx(topRight);
  }

  public int perimeter() {
    return 2 * (bottomLeft.dy(topRight) + bottomLeft.dx(topRight));
  }

  public static Rectangle createRectangle(Coordinate bottomLeft, Coordinate topRight) {
    return new Rectangle(bottomLeft, topRight);

  }public static Rectangle createSquare(Coordinate bottomLeft, Coordinate topRight) {
    return createRectangle(bottomLeft, topRight);
  }
}
