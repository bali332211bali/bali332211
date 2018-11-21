package Music;

public class Violin extends StringedInstrument {

  public Violin() {
    this.strings = 4;
  }

  @Override
  public String sound() {
    return "sound3";
  }

  @Override
  public void play() {
    System.out.println(getClassName() + " " + this.strings + " strings " + sound());
  }

  String getClassName() {
    return "name3";
  }
}
