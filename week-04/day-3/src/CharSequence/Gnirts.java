package CharSequence;

public class Gnirts implements CharSequence {

  String name;

  Gnirts(String name) {
    this.name = name;
  }

  @Override
  public int length() {
    return this.name.length();
  }

  @Override
  public char charAt(int index) {
    return this.name.charAt(name.length()-1-index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return this.name.substring(name.length()-1-end, name.length()-1-start);
//    return this.name.substring(start, end);
  }
}
