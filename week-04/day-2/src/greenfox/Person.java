package greenfox;

public class Person {


  String name;
  int age;
  String gender;

  Person() {
    this.name = "Jane";
    this.age = 20;
    this.gender = "female";

  }

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;

  }

  public void introduce() {
    System.out.println("name " + this.name + " " + this.age + " age " + this.gender + " gender");
  }

  public void getGoal() {
    System.out.println("goal");
  }


//  Person
//  Create a Person class with the following fields:
//
//  name: the name of the person
//  age: the age of the person (whole number)
//  gender: the gender of the person (male / female)
//  And the following methods:
//
//  introduce(): prints out "Hi, I'm name, a age year old gender."
//  getGoal(): prints out "My goal is: Live for the moment!"
//  And the following constructors:
//
//  Person(name, age, gender)
//  Person(): sets name to Jane Doe, age to 30, gender to female

}
