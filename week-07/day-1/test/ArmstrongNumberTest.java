import org.junit.Test;

import static org.junit.Assert.*;

public class ArmstrongNumberTest {


  @Test
  public void test_1() {
    assertTrue(ArmstrongNumber.isArmstrongNumber(1634));
    assertTrue(ArmstrongNumber.isArmstrongNumber(153));
    assertFalse(ArmstrongNumber.isArmstrongNumber(1353));
  }


}
