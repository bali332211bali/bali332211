import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest2 {

  @Test
  public void getApple() {
    Apples newApples = new Apples();
    assertEquals("Apple", newApples.getApple());
  }
}
