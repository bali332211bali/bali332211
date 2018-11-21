package Flyable;

import Zoo.Animal;

public class Bird extends Animal implements Flyable {

  public Bird(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String born() {
    return "eggs";
  }

  @Override
  public void land() {
    System.out.println("on ground");
  }

  @Override
  public void fly() {
    System.out.println("flying");
  }

  @Override
  public void takeOff() {
    System.out.println("starts to fly");
  }
}
