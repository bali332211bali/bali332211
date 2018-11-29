import java.util.HashMap;

public interface CountLettersInterface {


  void askUserForString();
  void putLettersOfStringInHashMapAsKeys(String string);
  void countOccurancesOfEachLetters(String string);
  void putOccurancesInHashMapAsValues(String string);
  void printOutHashMap(HashMap<Character, Integer> map);

}
