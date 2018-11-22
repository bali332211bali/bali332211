import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

  @Test
  public void letters() {
    CountLetters count = new CountLetters();

    HashMap<Character, Integer> letters = new HashMap<>();
    letters.put('s', 1);
    letters.put('t', 1);
    letters.put('r', 1);
    letters.put('i', 1);
    letters.put('n', 1);
    letters.put('g', 1);

    assertEquals(letters, count.letters("string"));
  }
}
