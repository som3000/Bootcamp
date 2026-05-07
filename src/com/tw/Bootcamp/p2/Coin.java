package com.tw.Bootcamp.p2;

public class Coin {

  public static double chanceOfGettingAtLeastOneTail(int noOfCoins) {
    final double totalOutcomes =  Math.pow(2, noOfCoins);
    final double favourableOutcomes =  totalOutcomes-1;
    return Probabilty.calculateProbability(favourableOutcomes, totalOutcomes);
  }

  public static double chanceOfNotGettingAtLeastOneTail(int noOfCoins) {
    return 1 - chanceOfGettingAtLeastOneTail(noOfCoins);
  }
}
