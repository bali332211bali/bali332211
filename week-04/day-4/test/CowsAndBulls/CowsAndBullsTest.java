package CowsAndBulls;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class CowsAndBullsTest {

  CowsAndBulls cowsAndBulls = new CowsAndBulls(123);

  @Test
  public void split() {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    assertEquals(numbers, cowsAndBulls.split(321));

  }

  @Test
  public void scanner() {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    for (int i = 0; i < numbers.size(); i++) {
      System.out.println("number");
      Scanner scanner = new Scanner(System.in);
      int user = scanner.nextInt();
    }

    assertEquals("cowcowbull", cowsAndBulls.);

  }
}
