package greenfox;

public class Sponsor extends Person {

  String company;
  int hiredStudents;

  Sponsor() {

    this.name = "Jane";
    this.age = 20;
    this.gender = "female";
    this.company = "google";
    this.hiredStudents = 0;
  }

  Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    this.hiredStudents = 0;

  }


  public void introduce() {
    System.out.println("name " + this.name + " " + this.age + " age " + this.gender + " gender "
        + "representing " + this.company + " hired " + this.hiredStudents);
  }

  public void hire() {
    this.hiredStudents++;
  }

  public void getGoal() {
    System.out.println("goal sponsor");
  }



}
