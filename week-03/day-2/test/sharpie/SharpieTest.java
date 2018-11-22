package sharpie;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SharpieTest {

  Sharpie sharpie = new Sharpie();

  @Test
  public void getInk() {
    assertEquals(sharpie.inkAmount, sharpie.getInk());
  }

  @Test
  public void use() {
  }
}
