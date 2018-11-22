package Farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

  Animal animal = new Animal(3,2);

  @Test
  public void eat() {
    assertEquals(animal.hunger-1, animal.eat());
  }

  @Test
  public void drink() {
  }

  @Test
  public void play() {
  }

  @Test
  public void initializeAnimals() {
  }

  @Test
  public void more() {
  }
}
