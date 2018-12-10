import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FibonacciTest {


  List<Integer> numbers = new ArrayList<>();

  @Test
  public void test() {

    numbers.add(0);
    numbers.add(1);

    assertEquals(5, Fibonacci.getFibonacciElement(5));
    assertEquals(144, Fibonacci.getFibonacciElement(12));

 }

}
