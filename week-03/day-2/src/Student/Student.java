package Student;

public class Student {

    public void learn(String learn) {

        System.out.println("learn");
    }

    public void question(Teacher teacher, String question) {
        teacher.answer(question);
    }





//    Create Student.Student and Student.Teacher classes
//            Student.Student
//    learn()
//    question(teacher) -> calls the teachers answer method
//            Student.Teacher
//    teach(student) -> calls the students learn method
//    answer()
}
