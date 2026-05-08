package com.tw.Bootcamp.p4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

  @Test
  void ShouldParkACar() throws ParkingLimitExceeds {
    final ParkingLot parkingLot = ParkingLot.create(1);
    parkingLot.parkCar("Car1");

    assertTrue(parkingLot.isFull());
  }

  @Test
  void ShouldThrowErrorWhenLimitExceeds() throws ParkingLimitExceeds {
    final ParkingLot parkingLot = ParkingLot.create(1);
    parkingLot.parkCar("Car1");

    assertThrows(ParkingLimitExceeds.class, () -> parkingLot.parkCar("Car2"));
  }
}