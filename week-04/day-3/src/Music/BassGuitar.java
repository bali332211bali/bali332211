package Music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this.strings = 4;
  }

  public BassGuitar(int strings) {
    this.strings = strings;
  }

  @Override
  public String sound() {
    return "sound2";
  }

  @Override
  public void play() {
    System.out.println(getClassName() + " " + this.strings + " strings " + sound());
  }

  String getClassName() {
    return "name2";
  }
}
