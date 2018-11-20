package Aircraft;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {


    List<Carrier> carriers = new ArrayList<>();

    for (int i = 0; i < 2 ; i++) {
      carriers.add(new Carrier(100, 5000));
    }

    for (int i = 0; i < 5; i++) {
      carriers.get(0).add(new F16());
      carriers.get(1).add(new F16());

      carriers.get(0).add(new F35());
      carriers.get(1).add(new F35());
    }

    carriers.get(0).getStatus();
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
    carriers.get(1).fight(carriers.get(0));

    System.out.println();
    System.out.println();

    carriers.get(0).getStatus();
    System.out.println();
    System.out.println();
    carriers.get(1).getStatus();







  }
}
