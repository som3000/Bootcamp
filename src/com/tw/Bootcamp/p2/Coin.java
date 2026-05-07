package com.tw.Bootcamp.p2;

public class Coin {

  public static double chanceOfGettingTail() {
    return 0.5;
  }

  public static double chanceOfNotGettingTail() {
    return 1 - chanceOfGettingTail();
  }
}
