package Garden;

public class Main {

  public static void main(String[] args) {


    Flower yellowFlower = new Flower("yellow");
    Tree brownTree = new Tree("brown");
    Plants newPlants = new Plants();


    for (int i = 0; i < 4; i++) {
      newPlants.addFlower(new Flower());
    }

    for (int i = 0; i < 4; i++) {
      newPlants.addTree(new Tree());
    }

    newPlants.waterAll(40);


    System.out.println();
    System.out.println();
    newPlants.getWaterStatus();
    System.out.println();
    System.out.println();

    System.out.println();
    System.out.println();




    yellowFlower.needsWaterStr();
    yellowFlower.water(40);
    yellowFlower.needsWaterStr();
    System.out.println(yellowFlower.waterAmount);



  }
}
