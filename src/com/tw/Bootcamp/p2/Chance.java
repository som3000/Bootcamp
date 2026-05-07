package com.tw.Bootcamp.p2;

import java.util.Objects;

public class Chance {
  private final double chance;

  private Chance(double chance){
    this.chance = chance;
  }

  public Chance and(Chance chance) {
    return Chance.create(chance.chance * this.chance);
  }

  public Chance or(Chance chance) {
    return Chance.create(chance.chance + this.chance - this.and(chance).chance);
  }

  public Chance deMorganLaw(Chance other) {
    return this.not().and(other.not()).not();
  }

  private Chance not() {
    return Chance.create(1 - this.chance);
  }

  public static Chance createChance(double chance) throws ImpossibleChanceCreationError {
    if(chance < 0 || chance > 1) {
      throw new ImpossibleChanceCreationError("Impossible Chance Creation");
    }

    return new Chance(chance);
  }

  private static Chance create(double chance) {
    return new Chance(chance);
  }

  public static Chance not(double chance) {
    return create(1 - chance);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Chance chance1)) return false;
    return Double.compare(chance, chance1.chance) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(chance);
  }
}
