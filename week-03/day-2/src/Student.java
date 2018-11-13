public class Student {

    public void learn(String learn) {

        System.out.println("learn");
    }

    public void question(Teacher teacher, String question) {
        teacher.answer(question);
    }





//    Create Student and Teacher classes
//            Student
//    learn()
//    question(teacher) -> calls the teachers answer method
//            Teacher
//    teach(student) -> calls the students learn method
//    answer()
}
