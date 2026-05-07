package com.tw.Bootcamp.p2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceTest {

  @Test
  void ShouldRepresentChanceOfGettingTailsInCoinFlip() {
    Chance chanceOfGettingTails = Chance.create(0.5);

    assertEquals(Chance.create(0.5), chanceOfGettingTails);
  }

  @Test
  void ShouldRepresentChanceOfNotGettingTailsInCoinFlip() {
    Chance chanceOfNotGettingTails = Chance.create(0.5);

    assertEquals(Chance.create(0.5), chanceOfNotGettingTails);
  }

  @Test
  void ShouldRepresentChanceOfGettingTailsInFlippingTwoCoins() {
    Chance chanceOfGettingTailsInFirstCoin = Chance.create(0.5);
    Chance chanceOfGettingTailsInSecondCoin = Chance.create(0.5);

    assertEquals(Chance.create(0.25),
            chanceOfGettingTailsInFirstCoin.and(chanceOfGettingTailsInSecondCoin));
  }

  @Test
  void ShouldRepresentChanceOfGettingAtLeastOneTailInFlippingTwoCoins() {
    Chance chanceOfGettingTailsInFirstCoin = Chance.create(0.5);
    Chance chanceOfGettingTailsInSecondCoin = Chance.create(0.5);

    assertEquals(Chance.create(0.75),
            chanceOfGettingTailsInFirstCoin.or(chanceOfGettingTailsInSecondCoin));
  }

  @Test
  void ShouldRepresentChanceOfGettingThreeOnDiceRoll() {
    Chance chanceOfGettingThree = Chance.create(0.166);

    assertEquals(Chance.create(0.166), chanceOfGettingThree);
  }

}