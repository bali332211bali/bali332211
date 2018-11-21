package Music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this.strings = 6;

  }

  public ElectricGuitar(int strings) {
    this.strings = strings;
  }

  @Override
  public String sound() {
    return "sound";
  }

  @Override
  public void play() {
    System.out.println(getClassName() + " " + this.strings + " strings " + sound());
  }

  String getClassName() {
    return "name";
  }

}
