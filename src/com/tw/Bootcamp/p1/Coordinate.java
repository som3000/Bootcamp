package com.tw.Bootcamp.p1;

public class Coordinate {
  private final int x;
  private final int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int length(Coordinate p){
    return Math.abs(this.x - p.x);
  }
  public int breadth(Coordinate p){
    return Math.abs(this.y - p.y);
  }
}
