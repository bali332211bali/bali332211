public class Anagram {

  boolean take(String string, String string2) {
    String a ="";
    for (int i = 0; i < string.length()-1; i++) {
      a += string.charAt(string.length()-1-i);
    }
    a += string.charAt(0);

    if (a.equalsIgnoreCase(string2)) {
      return true;
    } else {
      return false;
    }
  }


//  Write a function, that takes two strings and returns a boolean value based
//  on if the two strings are Anagramms or not.
//  Create a test for that.
}
