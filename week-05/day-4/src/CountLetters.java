import java.util.*;

public class CountLetters implements CountLettersInterface {

  static HashMap<Character, Integer> dictionary = new HashMap<>();
  static String user;
  static List<Integer> occurances = new ArrayList<>();

  @Override
  public void askUserForString() {
    System.out.println("Give me a string");
    Scanner scanner = new Scanner(System.in);
    user = scanner.nextLine();
  }

  @Override
  public void putLettersOfStringInHashMapAsKeys(String string) {
    for (int i = 0; i < string.length(); i++) {
      dictionary.put(string.charAt(i), 0);
    }
  }

  @Override
  public void countOccurancesOfEachLetters(String string) {

    for (int i = 0; i < string.length(); i++) {
      occurances.add(countOccuranceOfLetter(string ,string.charAt(i)));
    }
  }

  static int countOccuranceOfLetter(String string, char c) {
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
      if (c == string.charAt(i)) {
        count++;
      }
    }
    return count;
  }

  @Override
  public void putOccurancesInHashMapAsValues(String string) {
    for (int i = 0; i < string.length(); i++) {
      dictionary.put(string.charAt(i), occurances.get(i));
    }
  }

  @Override
  public void printOutHashMap(HashMap<Character, Integer> map) {
    for(Map.Entry<Character, Integer> entry : map.entrySet()) {
      System.out.println(entry);
    }
  }

  public static void main(String[] args) {

    CountLetters countLetters = new CountLetters();

    countLetters.askUserForString();
    countLetters.putLettersOfStringInHashMapAsKeys(user);
    countLetters.countOccurancesOfEachLetters(user);
    countLetters.putOccurancesInHashMapAsValues(user);

    countLetters.printOutHashMap(dictionary);
  }
}
