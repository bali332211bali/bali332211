import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void take() {
    Anagram anagram = new Anagram();
    assertTrue(anagram.take("take", "ekat"));
  }
}
