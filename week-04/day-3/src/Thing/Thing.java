package Thing;

public class Thing implements Comparable<Thing> {
  boolean completed;

  public Thing() {
    int n = (int) (Math.random()*10);
    if (n > 5) {
      this.completed = true;
    } else {
      this.completed = false;
    }

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
    return (completed ? "[x] " : "[ ] ");
  }


}
