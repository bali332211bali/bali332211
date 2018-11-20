package greenfox;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

  String name;
  List<Student> students = new ArrayList<>();
  List<Mentor> mentors = new ArrayList<>();


  Cohort(String name) {
    this.name = name;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println(this.name + " cohort " + this.students.size() + " students " + this.mentors.size() + " mentors");
  }
}
