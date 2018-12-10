public class Fibonacci {

  public static int getFibonacciElement(int element) {
    if (element == 1) {
      return 1;
    } else if (element == 0) {
      return 0;
    }
    return getFibonacciElement(element - 2) + getFibonacciElement(element - 1);
  }


}
