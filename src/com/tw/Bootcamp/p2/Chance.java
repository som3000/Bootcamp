package com.tw.Bootcamp.p2;

import java.util.Objects;

public class Chance {

  private final double chance;
  private final double complementChance;

  private Chance(double chance){
    this.chance = chance;
    this.complementChance = 1 - chance;
  }

  public static Chance create(double chance) {
    return new Chance(chance);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Chance chance1)) return false;
    return Double.compare(chance, chance1.chance) == 0 && Double.compare(complementChance, chance1.complementChance) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(chance, complementChance);
  }
}
