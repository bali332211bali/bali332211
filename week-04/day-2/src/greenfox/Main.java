package greenfox;

public class Main {


  public static void main(String[] args) {



    Person newPerson = new Person("Jane", 20, "female");
    Person newPerson2 = new Student();
    Person newPerson3 = new Mentor();
    newPerson.introduce();
    newPerson2.introduce();
    newPerson3.introduce();

  }
}
