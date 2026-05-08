package com.tw.Bootcamp.p4;

import java.util.ArrayList;

public class ParkingLot {
  private final ArrayList<String> lot;
  private final int availableSpaces;

  private ParkingLot(int availableSpaces) {
    this.availableSpaces = availableSpaces;
    this.lot = new ArrayList<>(availableSpaces);
  }

  public void parkCar(String carId) throws ParkingLimitExceeds {
    if(isFull()) {
      throw new ParkingLimitExceeds("Parking lot is already full");
    }

    lot.add(carId);
  }

  public boolean isFull() {
    return this.lot.size() == this.availableSpaces;
  }

  public static ParkingLot create(int vacantSpaces) {
    return new ParkingLot(vacantSpaces);
  }
}
