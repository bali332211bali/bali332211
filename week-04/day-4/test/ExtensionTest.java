import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExtensionTest {

    Extension extension = new Extension();

  @Test
  public void add() {
    assertEquals(6, extension.add(3,2));
//    assertEquals(5, extension.add(3,2));
  }

  @Test
  public void maxOfThree() {
    assertEquals(3, extension.maxOfThree(2,1,3));
//    assertEquals(2, extension.maxOfThree(2,1,3));
  }

  @Test
  public void median() {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);

    assertEquals(3,extension.median(numbers));
//    assertEquals(2,extension.median(numbers));


  }

  @Test
  public void isVowel() {
    assertTrue(extension.isVowel('c'));
//    assertTrue(extension.isVowel('a'));
  }

  @Test
  public void translate() {
    assertEquals("", extension.translate(""));
  }
}
