import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.*;

public class ParametricAverage {


  static int number() {

    System.out.println("number");
    Scanner scanner = new Scanner(System.in);
    int user = scanner.nextInt();

    return user;
  }



  public static void main(String[] args) {


    HashMap<String, Integer> hashMap = new HashMap<>();
    List<Integer> numbers = new ArrayList<>();

    try {
      Path path = Paths.get("src/log.txt");
      List<String> str = Files.readAllLines(path);

      for (String string : str) {
        System.out.println(string);
      }
      System.out.println();

      Files.lines(path)
          .forEach(System.out::println);
    } catch (Exception a) {
      System.out.println(a);
    }

    String number = "7";
    int number2 = Integer.parseInt(number);
    System.out.println(number2);

    int n = 3;
    for (int i = 0; i < n; i++) {
      numbers.add(number());
    }

    int count = 0;
    for (int i = 0; i < numbers.size(); i++) {
      count += numbers.get(i);
    }

    System.out.println(n + " numbers");
    System.out.println("sum " + count);
    System.out.println("average " + (double) count/n);
    System.out.print("average ");
    System.out.println(new DecimalFormat("#.##").format((double) count/n));

    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
      System.out.println(entry);
    }





  }


// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
}
