package Student;

public class Teacher {

    public void teach(Student student, String teach) {
        student.learn(teach);
    }

    public void answer(String question) {

        System.out.println("answer to " + question + " answer");
    }







//    Create Student.Student and Student.Teacher classes
//            Student.Student
//    learn()
//    question(teacher) -> calls the teachers answer method
//            Student.Teacher
//    teach(student) -> calls the students learn method
//    answer()
}
