import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {

  public static void main(String[] args) {
  }

  public static boolean isAnagram(String word_1, String word_2) {



    String word_1Sorted = Arrays.stream(word_1.split(""))
        .sorted(String::compareTo)
        .collect(Collectors.joining());
    String word_2Sorted = Arrays.stream(word_2.split(""))
        .sorted(String::compareTo)
        .collect(Collectors.joining());
    return word_1Sorted.equalsIgnoreCase(word_2Sorted);
  }
}
