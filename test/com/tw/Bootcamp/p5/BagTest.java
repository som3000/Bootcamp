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

  @Test
  void ShouldLimitRedBeAtMostTwiceOfGreenBallsInsideBag() {
    bag.add(greenBall);

    assertTrue(bag.add(redBall));
    assertTrue(bag.add(redBall));
    assertFalse(bag.add(redBall));
  }

  @Test
  void ShouldLimitYellowBeAtMostFortyPercentOfTheTotalInsideBag() {
    bag.add(greenBall);
    bag.add(redBall);
    bag.add(redBall);

    assertTrue(bag.add(yellowBall));
    assertTrue(bag.add(yellowBall));
    assertFalse(bag.add(yellowBall));
  }

  @Test
  void ShouldGenerateSummaryOfTheContentsOfBag() {
    bag.add(blueBall);
    bag.add(greenBall);
    bag.add(redBall);
    bag.add(yellowBall);
    bag.add(redBall);
    bag.add(blueBall);
    bag.add(blueBall);
    bag.add(yellowBall);
    bag.add(yellowBall);

    assertEquals("BLUE : 3\nGREEN : 1\nRED : 2\nYELLOW : 3\n\nTotal : 9", bag.summary().toString());
  }
}