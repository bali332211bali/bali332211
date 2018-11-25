import java.util.HashMap;
import java.util.Map;

public class CountLetters {


  static int charEquals(String string, int k) {
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == string.charAt(k)) {
        count++;
      }
    }
    return count;
  }

  static HashMap<Character, Integer> letters(String string) {

    HashMap<Character, Integer> newHashMap = new HashMap<>();
    for (int i = 0; i < string.length(); i++) {
      newHashMap.put(string.charAt(i), charEquals(string, i));
    }
    return newHashMap;
  }

  public static void main(String[] args) {


    for (Map.Entry<Character, Integer> entry: letters("aab").entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

//  Write a function, that takes a string as an argument and returns a dictionary with all
//  letters in the string as keys, and numbers as values that shows how many occurrences there are.
//  Create a test for that.
}
