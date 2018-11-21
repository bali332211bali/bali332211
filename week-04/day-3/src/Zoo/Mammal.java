package Zoo;

public class Mammal extends Animal {

  public Mammal(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String born() {
    return "small";
  }
}
