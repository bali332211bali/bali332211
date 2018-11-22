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

//  public static void main(String[] args) {
//    for (int i = 0; i < 10; i++) {
//      System.out.println(numbers(i));
//    }
//  }



//  Write a function that computes a member of the fibonacci sequence by a given index
//  Create tests that covers all types of input (like in the previous workshop exercise)
}
