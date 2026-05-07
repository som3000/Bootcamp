package com.tw.Bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void ShouldRepresentChanceOfGettingTailsInCoinFlip() throws ImpossibleChanceCreationError {
    Chance chanceOfGettingTails = Chance.createChance(0.5);

    assertEquals(Chance.createChance(0.5), chanceOfGettingTails);
    assertEquals(Chance.createChance(0.5).hashCode(), chanceOfGettingTails.hashCode());
  }

  @Test
  void ShouldRepresentChanceOfNotGettingTailsInCoinFlip() throws ImpossibleChanceCreationError {
    Chance chanceOfNotGettingTails = Chance.not(0.5);

    assertEquals(Chance.createChance(0.5), chanceOfNotGettingTails);
  }

  @Test
  void ShouldRepresentChanceOfGettingTailsInFlippingTwoCoins() throws ImpossibleChanceCreationError {
    Chance chanceOfGettingTailsInFirstCoin = Chance.createChance(0.5);
    Chance chanceOfGettingTailsInSecondCoin = Chance.createChance(0.5);

    assertEquals(Chance.createChance(0.25),
            chanceOfGettingTailsInFirstCoin.and(chanceOfGettingTailsInSecondCoin));
  }

  @Test
  void ShouldRepresentChanceOfGettingThreeOnDiceRoll() throws ImpossibleChanceCreationError {
    Chance chanceOfGettingThree = Chance.createChance(0.166);

    assertEquals(Chance.createChance(0.166), chanceOfGettingThree);
  }

  @Test
  void ShouldRepresentChanceOfGettingAtLeastOneTailInFlippingTwoCoins() throws ImpossibleChanceCreationError {
    Chance chanceOfGettingTailsInFirstCoin = Chance.createChance(0.5);
    Chance chanceOfGettingTailsInSecondCoin = Chance.createChance(0.5);

    assertEquals(Chance.createChance(0.75),
            chanceOfGettingTailsInFirstCoin.or(chanceOfGettingTailsInSecondCoin));
  }

  @Test
  void DeMorganLawTest() throws ImpossibleChanceCreationError {
    Chance chanceOfGettingTailsInFirstCoin = Chance.createChance(0.5);
    Chance chanceOfGettingTailsInSecondCoin = Chance.createChance(0.5);

    assertEquals(Chance.createChance(0.75),
            chanceOfGettingTailsInFirstCoin.deMorganLaw(chanceOfGettingTailsInSecondCoin));
  }

  @Test
  void ShouldThrowErrorForImpossibleChanceCreation() {
    assertThrows(ImpossibleChanceCreationError.class, () -> Chance.createChance(-1));
    assertThrows(ImpossibleChanceCreationError.class, () -> Chance.createChance(2));
  }

}