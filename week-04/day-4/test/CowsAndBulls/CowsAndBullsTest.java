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

//    assertEquals("cowcowbull", cowsAndBulls.scanner(numbers));
  }

}
