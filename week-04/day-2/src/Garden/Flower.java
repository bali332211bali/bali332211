package Garden;

public class Flower extends Plant {


  Flower() {

  }

  public void needsWater() {
    if (this.waterAmount < 5) {
      System.out.println(this.color + " Flower needs water");
    } else {
      System.out.println(this.color + " doesn't need water");
    }
  }







//  The Flower
//  needs water if its current water amount is less then 5
//  when watering it the flower can only absorb the 75% of the water
//  eg. watering with 10 the flower's amount of water should only increase with 7.5
}
