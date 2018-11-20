package Garden;

public class Plant {

  String color;
  double waterAmount;

  Plant() {

  }

  public void water(int amount) {
    if (this instanceof Flower) {
      this.waterAmount += 0.75 * amount;
    } else {
      this.waterAmount += 0.4 * amount;
    }
  }

}
