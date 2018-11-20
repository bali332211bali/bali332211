package Garden;

public class Flower extends Plants {

  Flower() {
    this.waterAmount = (int) (Math.random()*7);
  }

  Flower(String color) {
    this.color = color;
    this.waterAmount = (int) (Math.random()*7);
  }

  public void needsWaterStr() {
    this.needsWaterClass(5);
  }







//  The Flower
//  needs water if its current water amount is less then 5
//  when watering it the flower can only absorb the 75% of the water
//  eg. watering with 10 the flower's amount of water should only increase with 7.5
}
