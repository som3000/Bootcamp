package com.tw.Bootcamp.p5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

  Ball blueBall;
  Ball redBall;
  Ball greenBall;
  Ball yellowBall;

  @BeforeEach
  void setUp() {
    blueBall = new Ball(Colors.BLUE);
    redBall = new Ball(Colors.RED);
    greenBall = new Ball(Colors.GREEN);
    yellowBall = new Ball(Colors.YELLOW);
  }

  @Test
  void ShouldCheckTheColorOfBall() {
    assertTrue(blueBall.isBlue());
    assertTrue(greenBall.isGreen());
    assertTrue(yellowBall.isYellow());
    assertTrue(redBall.isRed());
  }

  @Test
  void ShouldReturnFalseForDifferentBallColorCheck() {
    assertFalse(blueBall.isGreen());
    assertFalse(yellowBall.isGreen());
    assertFalse(redBall.isGreen());
    assertFalse(greenBall.isBlue());
  }
}