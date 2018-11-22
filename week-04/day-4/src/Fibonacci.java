import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

  int numbers(int n) {
    if (n <= 0) {
      return 0;
    } else if (n <= 2) {
      return 1;
    } else {
      return numbers(n-2) + numbers(n-1);
    }
  }

  int numbers2(int n) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(0);
    numbers.add(1);
    for (int i = 0; i < n; i++) {
      numbers.add(numbers.get(i)+numbers.get(i+1));
    }
    return numbers.get(n);
  }


  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();
    for (int i = 0; i < 10; i++) {
      System.out.println(fibonacci.numbers(i));
    }
    System.out.println();
    for (int i = 0; i < 10; i++) {
      System.out.println(fibonacci.numbers2(i));
    }
  }



//  Write a function that computes a member of the fibonacci sequence by a given index
//  Create tests that covers all types of input (like in the previous workshop exercise)
}
