package com.tw.Bootcamp.p4;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public enum Events {
  EIGHTY_PERCENT_THRESHOLD((totalSlots,occupied)-> ((double) occupied/totalSlots)* 100 >= 80);

  private final BiPredicate<Integer, Integer> predicate;

  Events(BiPredicate<Integer, Integer> predicate) {
    this.predicate = predicate;
  }

  public boolean test(int totalSlots, int occupied) {
    return predicate.test(totalSlots, occupied);
  }
}
