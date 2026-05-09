package com.tw.Bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

  @Test
  void ShouldAddABallInBag() {
    final Bag bag = Bag.create();
    final Ball ball = new Ball();

    assertTrue(bag.add(ball));
  }

  @Test
  void ShouldNotAddBallInFilledBag() {
    final Bag bag = Bag.create();
    final Ball firstBall = new Ball();
    final Ball secondBall = new Ball();

    bag.add(firstBall);

    assertFalse(bag.add(secondBall));
  }
}