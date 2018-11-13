package Student;

public class Main {

    public static void main(String[] args) {

        Teacher teacher2 = new Teacher();
        Student student2 = new Student();

        student2.question(teacher2,"question");
        teacher2.teach(student2, "teach");
    }
}
