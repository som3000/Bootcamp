package com.tw.Bootcamp.p2;

import java.util.Objects;

public class Chance {

  private final double chance;

  private Chance(double chance){
    this.chance = chance;
  }

  public Chance and(Chance chance) {
    return new Chance(chance.chance * this.chance);
  }

  public Chance or(Chance chance) {
    final Chance chanceOfIntersection = this.and(chance);

    return new Chance(chance.chance + this.chance - chanceOfIntersection.chance);
  }

  public Chance deMorganLaw(Chance chance) {
    final Chance ComplementOfA = this.complementChance(chance);
    final Chance ComplementOfB = this.complementChance(this);

    return this.complementChance(ComplementOfA.or(ComplementOfB));
  }

  private Chance complementChance(Chance chance) {
    return new Chance(1 - chance.chance);
  }

  public static Chance create(double chance) {
    return new Chance(chance);
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
