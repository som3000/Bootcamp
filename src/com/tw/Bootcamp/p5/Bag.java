package com.tw.Bootcamp.p5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bag {
  private final Map<Colors, Integer> bag;
  private final int capacity;
  private int totalBalls = 0;

  private Bag(int capacity) {
    this.capacity = capacity;
    this.bag = new LinkedHashMap<>();
  }

  private boolean isFull(){
    return totalBalls >= capacity;
  }

  private boolean isGreenBallLimitExceeds(Ball ball) {
    return ball.isGreen() && this.bag.getOrDefault(Colors.GREEN, 0) >= 3;
  }

  private boolean isRedBallLimitExceeds(Ball ball) {
    return ball.isRed() && this.bag.getOrDefault(Colors.GREEN, 0) * 2 <= this.bag.getOrDefault(Colors.RED, 0);
  }


  private boolean isYellowBallLimitExceeds(Ball ball) {
    return ball.isYellow() && (double) (this.bag.getOrDefault(Colors.YELLOW, 0) + 1) / (totalBalls + 1) > 0.4;
  }

  private boolean isLimitExceeded(Ball ball) {
    return isGreenBallLimitExceeds(ball) || isRedBallLimitExceeds(ball) || isYellowBallLimitExceeds(ball);
  }

  public boolean add(Ball ball) {
    if(isFull() || isLimitExceeded(ball)){
      return false;
    }

    if(ball.isGreen()) this.bag.merge(Colors.GREEN, 1, Integer::sum);
    if(ball.isRed()) this.bag.merge(Colors.RED, 1, Integer::sum);
    if(ball.isYellow()) this.bag.merge(Colors.YELLOW, 1, Integer::sum);
    if(ball.isBlue()) this.bag.merge(Colors.BLUE, 1, Integer::sum);

    totalBalls++;

    return true;
  }

  public StringBuilder summary() {
    final StringBuilder report = new StringBuilder();

    this.bag.forEach((Colors color, Integer count) -> {
      report.append(color.name()).append(" : ").append(count).append("\n");
    });

    report.append("\n").append("Total : ").append(totalBalls);

    return report;
  }

  public void displaySummary() {
    System.out.println(this.summary());
  }

  public static Bag create(int capacity) {
    return new Bag(capacity);
  }
}
