package com.tw.Bootcamp.p5;

public class Ball {
  private final Colors color;

  public Ball(Colors color) {
    this.color = color;
  }

  public boolean isGreen() {
    return this.color == Colors.GREEN;
  }
}
