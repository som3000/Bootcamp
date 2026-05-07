package com.tw.Bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
  @Test
  void ShouldCalculateChanceOfTail(){
    assertEquals(0.5, Coin.chanceOfGettingTail());
  }
  
  @Test
  void ShouldCalculateChanceOfNotTail(){
    assertEquals(0.5, Coin.chanceOfNotGettingTail());
  }

}