package com.tw.Bootcamp.p5;

import java.util.ArrayList;
import java.util.List;

public class Bag {
  private final List<Ball> collection;
  private final int capacity;
  private int noOfGreenBalls = 0;

  private Bag(int capacity) {
    this.capacity = capacity;
    this.collection = new ArrayList<>(capacity);
  }

  private boolean isFull(){
    return collection.size()>= capacity;
  }

  private boolean isGreenBallLimitExceeds(Ball ball) {
    return ball.isGreen() && this.noOfGreenBalls >= 3;
  }

  public boolean add(Ball ball) {
    if(isFull() || isGreenBallLimitExceeds(ball)){
      return false;
    }

    if(ball.isGreen()) this.noOfGreenBalls++;

    this.collection.add(ball);

    return true;
  }

  public static Bag create(int capacity) {
    return new Bag(capacity);
  }
}
