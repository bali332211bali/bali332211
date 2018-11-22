import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void add() {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(4);
    numbers.add(5);

    Sum sum = new Sum();
    assertEquals(10, sum.add(numbers));
  }
}
