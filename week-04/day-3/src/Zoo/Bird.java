package Zoo;

public class Bird extends Animal {

  public Bird(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String born() {
    return "eggs";
  }
}
