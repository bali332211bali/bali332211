package Zoo;

public class Reptile extends Animal {

  public Reptile(String name) {
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
