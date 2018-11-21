package Thing;

public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(Thing o) {
    if (this.completed != o.completed) {
      if (this.completed) {
        return -1;
      }
      return 1;
    }
    return 0;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }


}
