package Car;

public class Vehicle {

  public int maxSpeed;
  public String color;

  Vehicle() {
    this.maxSpeed = 0;
    this.color = "";
  }

  Vehicle(int maxSpeed, String color) {
    this.maxSpeed = maxSpeed;
    this.color = color;
  }

  public String toString() {
    return this.color + " vehicle speed " + this.maxSpeed;
  }




}
