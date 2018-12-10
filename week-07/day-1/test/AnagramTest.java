import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

   @Test
  public void test1() {
     assertTrue(Anagram.isAnagram("aaa", "aaa"));
     assertTrue(Anagram.isAnagram("aab", "aba"));
     assertTrue(Anagram.isAnagram("a$a  b", "a b a$"));
   }


}
