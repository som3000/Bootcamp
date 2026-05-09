package com.tw.Bootcamp.p5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

  Bag bag;
  Ball blueBall;
  Ball redBall;
  Ball greenBall;
  Ball yellowBall;

  @BeforeEach
  void setUp() {
    bag = Bag.create(12);
    blueBall = new Ball(Colors.BLUE);
    redBall = new Ball(Colors.RED);
    greenBall = new Ball(Colors.GREEN);
    yellowBall = new Ball(Colors.YELLOW);
  }

  @Test
  void ShouldAddABallInBag() {
    assertTrue(bag.add(blueBall));
  }

  @Test
  void ShouldNotAddBallInFilledBag() {
    final Bag smallBag = Bag.create(1);
    smallBag.add(blueBall);

    assertFalse(smallBag.add(redBall));
  }

  @Test
  void ShouldLimitAddingAtMostThreeGreenBallsInsideBag() {
    bag.add(greenBall);
    bag.add(greenBall);

    assertTrue(bag.add(greenBall));
    assertFalse(bag.add(greenBall));
    assertTrue(bag.add(yellowBall));

  }
}