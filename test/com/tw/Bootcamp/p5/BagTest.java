package com.tw.Bootcamp.p5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

  @Nested
  class WithAllRules {
    Bag bag;
    List<Rules> rules;
    Ball blueBall;
    Ball redBall;
    Ball greenBall;
    Ball yellowBall;

    @BeforeEach
    void setUp() {
      rules = new ArrayList<>(4);
      rules.add(Rules.RULE_1);
      rules.add(Rules.RULE_2);
      rules.add(Rules.RULE_3);
      rules.add(Rules.RULE_4);

      bag = Bag.create(12, rules);
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
      final Bag smallBag = Bag.create(1, rules);
      smallBag.add(blueBall);

      assertFalse(smallBag.add(blueBall));
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
    void ShouldGenerateSummaryOfTheContentsOfBagWithEachColorBall() {
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

    @Test
    void ShouldGenerateSummaryOfTheContentsOfBag() {
      bag.add(blueBall);
      bag.add(greenBall);

      assertEquals("BLUE : 1\nGREEN : 1\n\nTotal : 2", bag.summary().toString());
    }
  }

  @Nested
  class WithSomeRules {
    Bag bag;
    List<Rules> rules;
    Ball blueBall;
    Ball redBall;
    Ball greenBall;
    Ball yellowBall;

    @BeforeEach
    void setUp() {
      rules = new ArrayList<>(4);
      blueBall = new Ball(Colors.BLUE);
      redBall = new Ball(Colors.RED);
      greenBall = new Ball(Colors.GREEN);
      yellowBall = new Ball(Colors.YELLOW);
    }

    @Test
    void ShouldCheckOnlyFirstRule() {
      rules = new ArrayList<>(4);
      rules.add(Rules.RULE_1);

      bag = Bag.create(12, rules);

      assertTrue(bag.add(redBall));
      assertTrue(bag.add(yellowBall));
      assertTrue(bag.add(greenBall));
      assertTrue(bag.add(greenBall));
      assertTrue(bag.add(greenBall));
      assertTrue(bag.add(greenBall));
    }

    @Test
    void ShouldCheckOnlyFirstAndSecondRule() {
      rules = new ArrayList<>(4);
      rules.add(Rules.RULE_1);
      rules.add(Rules.RULE_2);

      bag = Bag.create(12, rules);

      assertTrue(bag.add(redBall));
      assertTrue(bag.add(greenBall));
      assertTrue(bag.add(greenBall));
      assertTrue(bag.add(greenBall));
      assertFalse(bag.add(greenBall));
      assertTrue(bag.add(yellowBall));
    }

    @Test
    void ShouldCheckOnlyFirstAndSecondAndThirdRule() {
      rules = new ArrayList<>(4);
      rules.add(Rules.RULE_1);
      rules.add(Rules.RULE_2);
      rules.add(Rules.RULE_3);

      bag = Bag.create(5, rules);

      assertTrue(bag.add(greenBall));
      assertTrue(bag.add(redBall));
      assertTrue(bag.add(redBall));
      assertFalse(bag.add(redBall));
    }
  }
}