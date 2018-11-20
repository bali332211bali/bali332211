package greenfox;

public class Mentor extends Person {


  String level;

  Mentor() {
    this.name = "Jane";
    this.age = 20;
    this.gender = "female";
    this.level = "intermediate";
  }

  Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  public void getGoal() {
    System.out.println("another goal");
  }

  public void introduce() {
    System.out.println("name " + this.name + " " + this.age + " age " + this.gender + " gender " + this.level);
  }


//  Create a Mentor class that has the same fields and methods as the Person class, and has the following additional
//
//  fields:
//  level: the level of the mentor (junior / intermediate / senior)
//  methods:
//  getGoal(): prints out "Educate brilliant junior software developers."
//  introduce(): "Hi, I'm name, a age year old gender level mentor."
//  The Mentor class has the following constructors:
//
//  Mentor(name, age, gender, level)
//  Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
}
