package greenfox;

public class Student extends Person {


  String previousOrganization;
  int skippedDays;

  Student() {
    this.name = "Jane";
    this.age = 20;
    this.gender = "female";
    this.previousOrganization = "organization";
    this.skippedDays = 0;

  }

  Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public void getGoal() {
    System.out.println("goal again");
  }

  public void introduce() {
    System.out.println("name " + this.name + " " + this.age + " age " + this.gender + " gender " + "from " + this.previousOrganization + " skipped " + this.skippedDays);
  }

}
