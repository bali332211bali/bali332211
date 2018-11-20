package Garden;

public class Tree extends Plants {

  Tree() {
    this.waterAmount = (int) (Math.random()*13);
  }

  Tree(String color) {
    this.color = color;
    this.waterAmount = (int) (Math.random()*13);
  }

  public void needsWaterStr() {
    this.needsWaterClass(10);
  }

}
