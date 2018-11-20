package Garden;

import java.util.ArrayList;
import java.util.List;

public class Plants {

  String color;
  double waterAmount;
  List<Flower> flowers = new ArrayList<>();
  List<Tree> trees = new ArrayList<>();

  Plants() {

  }

  public void waterAll(int amount) {
    System.out.println("watering " + amount);

    for (int i = 0; i < flowers.size(); i++) {
      if(flowers.get(i).needsWater()) {
        System.out.println(flowers.get(i).color + " Flower" + " needs water");
        flowers.get(i).waterAmount += 0.75 * amount;
      } else {
        System.out.println(flowers.get(i).color + " Flower" + " doesn't need water");
      }
    }

    for (int i = 0; i < trees.size(); i++) {
      if(trees.get(i).needsWater()) {
        System.out.println(trees.get(i).color + " Tree" + " needs water");
        trees.get(i).waterAmount += 0.4 * amount;
      } else {
        System.out.println(trees.get(i).color + " Tree" + " doesn't need water");
      }
    }
  }

  public void water(int amount) {
    if (this instanceof Flower && this.needsWater()) {
      this.waterAmount += 0.75 * amount;
    } else {
      if(this.needsWater())
      this.waterAmount += 0.4 * amount;
    }
  }

  public void needsWaterClass(int amount) {
    if (this.waterAmount < amount) {
      System.out.println(this.color + getClassName() + " needs water");
    } else {
      System.out.println(this.color + getClassName() + " doesn't need water");
    }
  }

  public boolean needsWater() {
    if (this instanceof Flower) {
      if (this.waterAmount < 5) {
        return true;
      }
  } else {
      if(this.waterAmount < 10) {
        return true;
      }
    }
    return false;
  }

  public String getClassName() {
    if(this instanceof Flower) {
      return " Flower";
    }
    return " Tree";
  }

  public void addFlower(Flower flower) {
    flowers.add(flower);
  }

  public void addTree(Tree tree) {
    trees.add(tree);
  }

  public List<Flower> getFlowers() {
    return flowers;
  }

  public List<Tree> getTrees() {
    return trees;
  }

  public void getWaterStatus() {
    for (int i = 0; i < flowers.size(); i++) {
      if(flowers.get(i).needsWater()) {
        System.out.println(flowers.get(i).color + " Flower" + " needs water");
      } else {
        System.out.println(flowers.get(i).color + " Flower" + " doesn't need water");
      }
    }

    for (int i = 0; i < trees.size(); i++) {
      if(trees.get(i).needsWater()) {
        System.out.println(trees.get(i).color + " Tree" + " needs water");
      } else {
        System.out.println(trees.get(i).color + " Tree" + " doesn't need water");
      }
    }


  }





}
