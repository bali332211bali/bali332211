import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArmstrongNumber {


  public static boolean isArmstrongNumber(int number) {

    String[] numberStr = Integer.toString(number).split("");

    int armstrongSum = Arrays
        .stream(numberStr)
        .mapToInt(str -> (int) (Math.pow(Integer.parseInt(str), numberStr.length)))
        .sum();

    return armstrongSum == number;

  }


  public String[] splitNumberToString(int number) {

    String[] numberStr = Integer.toString(number).split("");

    return numberStr;

  }


  public int sumRaisedNumbers(String[] numberStr) {

    int sumOfRaisedNumbers = 0;

    for (int i = 0; i < numberStr.length; i++) {
      sumOfRaisedNumbers += Math.pow(Integer.parseInt(numberStr[i]), numberStr.length);
    }

    return sumOfRaisedNumbers;

  }


  public static void main(String[] args) {
    int startNumber = 153;

    if (ArmstrongNumber.isArmstrongNumber(startNumber)) {
      System.out.println("Armstrong number");
    } else {
      System.out.println("not Armstrong number");
    }

  }

}
