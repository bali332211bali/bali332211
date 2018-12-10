import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArmstrongNumber {


  public static boolean isArmstrongNumber(int number) {

    String[] numberStr = Integer.toString(number).split("");

   int armstrongSum = Arrays.stream(numberStr)
        .mapToInt(str -> (int) (Math.pow(Integer.parseInt(str), numberStr.length)))
        .sum();

    return armstrongSum == number;
  }
}
