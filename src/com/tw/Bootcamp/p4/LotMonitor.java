package com.tw.Bootcamp.p4;

import java.util.ArrayList;

public class LotMonitor {
  private final ArrayList<LotObserver> observers;

  public LotMonitor() {
    this.observers = new ArrayList<>();
  }

  public boolean addObserver(LotObserver observer) {
    observers.add(observer);

    return true;
  }
}
