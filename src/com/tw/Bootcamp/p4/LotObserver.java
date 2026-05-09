package com.tw.Bootcamp.p4;

public interface LotObserver {
  public void onPark(int lotId, int totalSlots, int occupied);
}
