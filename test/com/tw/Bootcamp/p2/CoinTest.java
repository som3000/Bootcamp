package com.tw.Bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
  @Test
  void ShouldCalculateChanceOfAtLeastOneTail(){
    assertEquals(0.5, Coin.chanceOfGettingAtLeastOneTail(1));
    assertEquals(0.75, Coin.chanceOfGettingAtLeastOneTail(2));
  }

  @Test
  void ShouldCalculateChanceOfNotTail(){
    assertEquals(0.5, Coin.chanceOfNotGettingAtLeastOneTail(1));
    assertEquals(0.25, Coin.chanceOfNotGettingAtLeastOneTail(2));
  }

}