package com.tw.Bootcamp.p5;

import java.util.ArrayList;
import java.util.List;

public class Bag {
  private final List<Ball> collection;
  private final int capacity;

  private Bag(int capacity) {
    this.capacity = capacity;
    this.collection = new ArrayList<>(capacity);
  }

  private boolean isFull(){
    return collection.size()>= capacity;
  }

  public boolean add(Ball ball) {
    if(isFull()){
      return false;
    }
    
    this.collection.add(ball);

    return true;
  }

  public static Bag create() {
    return new Bag(1);
  }
}
