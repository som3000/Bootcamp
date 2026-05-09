package com.tw.Bootcamp.p5;

import java.util.function.BiFunction;

public enum Rules {
  RULE_1(Bag:: isFull),
  RULE_2(Bag:: isGreenBallLimitExceeds),
  RULE_3(Bag:: isRedBallLimitExceeds),
  RULE_4(Bag:: isYellowBallLimitExceeds);

  private final BiFunction<Bag, Ball, Boolean> action;

  Rules(BiFunction<Bag, Ball, Boolean> action) {
    this.action = action;
  }

  public boolean apply(Bag bag, Ball ball) {
    return action.apply(bag, ball);
  }
}
