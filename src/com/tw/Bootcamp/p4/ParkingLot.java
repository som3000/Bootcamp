package com.tw.Bootcamp.p4;

import java.util.ArrayList;

public class ParkingLot {
  private final int id;
  private final int capacity;
  private final ArrayList<Vehicle> slots;

  private ParkingLot(int id, int capacity, LotMonitor monitor) {
    this.id = id;
    this.capacity = capacity;
    this.slots = new ArrayList<>(capacity);
  }

  public boolean park(Vehicle vehicle) {
    slots.add(vehicle);
//    notifyOnPark();
    return true;
  }

//  public static ParkingLot create(int id, int capacity) {
//    return new ParkingLot(id, capacity);
//  }
}
