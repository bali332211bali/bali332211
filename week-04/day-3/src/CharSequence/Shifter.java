package CharSequence;

public class Shifter implements CharSequence {

  String name;
  int shift;

  Shifter(String name, int shift) {
    this.name = name;
    this.shift = shift;
  }

  @Override
  public int length() {
    return this.name.length();
  }

  @Override
  public char charAt(int index) {
    return this.name.charAt(this.shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return this.name.substring(name.length()-1-end, name.length()-1-start);
  }


}
