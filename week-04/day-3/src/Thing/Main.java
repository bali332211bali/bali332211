package Thing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Thing> things = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      things.add(new Thing());
    }

    Collections.sort(things);

    for (int i = 0; i < things.size(); i++) {
      System.out.println(things.get(i).completed);
    }



  }
}
