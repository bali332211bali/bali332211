package Aircraft;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {


    List<Carrier> carriers = new ArrayList<>();

    for (int i = 0; i < 2; i++) {
      carriers.add(new Carrier(600, 10000));
    }
    System.out.println();
    System.out.println("ammo " + carriers.get(0).ammoStore);
    System.out.println("ammo " + carriers.get(1).ammoStore);
    System.out.println();
    System.out.println();

    for (int i = 0; i < 20; i++) {
      carriers.get(0).add(new F16());
      carriers.get(1).add(new F16());

      carriers.get(0).add(new F35());
      carriers.get(1).add(new F35());
    }

    System.out.println("ammo needed " + carriers.get(0).totalAmmoNeeded());
    System.out.println("ammo needed " + carriers.get(1).totalAmmoNeeded());
    System.out.println();
    try {
      carriers.get(0).fill();
      carriers.get(1).fill();
    } catch (Exception a) {
      System.out.println(a);
    }
    System.out.println();
    System.out.println();

    carriers.get(0).getStatus();
    System.out.println();
    System.out.println();
    carriers.get(1).getStatus();

    System.out.println();
    System.out.println();
    System.out.println();
    carriers.get(0).fight(carriers.get(1));

    System.out.println();
    System.out.println();

    carriers.get(0).getStatus();
    System.out.println();
    System.out.println();
    carriers.get(1).getStatus();


  }
}
