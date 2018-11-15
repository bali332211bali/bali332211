public class string3 {

  private static String str(String str) {

    if (str.length() > 1) {
      return str(str.substring(0, str.length()-1)) + "*" + str.charAt(str.length()-1);
    }
    return str;
  }


  public static void main(String[] args) {
    System.out.println(str("afsd"));

    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
  }



}
