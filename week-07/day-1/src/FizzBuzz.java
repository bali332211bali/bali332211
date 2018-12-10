public class FizzBuzz {

  public static String getFizzBuzzValue(int elementOfFizzBuzz) {
    
    if (elementOfFizzBuzz % 3 == 0 && elementOfFizzBuzz % 5 == 0) {
      return "FizzBuzz";
    } else if (elementOfFizzBuzz % 5 == 0) {
      return "Buzz";
    } else if (elementOfFizzBuzz % 3 == 0) {
      return "Fizz";
    }
    return Integer.toString(elementOfFizzBuzz);
  }


}
