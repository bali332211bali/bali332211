import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import static java.nio.file.Files.readAllLines;


public class count {


    private static int file(String file) {

        try {

            List<String> put = new ArrayList<>();
            put.add("dsgaa");
            put.add("dsgaaaargdfa");
            put.add("dsgaaaargdfargagdfg");

            Path path = Paths.get(file);
            Files.write(path, put);
            List<String> str = Files.readAllLines(path);
            return str.size();
        } catch (Exception a) {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(file("file.txt"));
        System.out.println();
        System.out.println();
        System.out.println();



        try {


            Path path = Paths.get("src/divide.java");

            for (String str : Files.readAllLines(path)) {
                System.out.println(str);
            }

            System.out.println();
            System.out.println();

           Files.lines(path)
                    .map(str2 -> str2.toUpperCase())
                    .filter(str2 -> str2.startsWith(" "))
                    .forEach(str2 -> System.out.println(str2));



        } catch (Exception c) {
            System.out.println("can't");
        }

//        try {
//            Path path = Paths.get("file.txt");
//            Files.deleteIfExists(path);
//            System.out.println("deleted");
//        } catch (Exception b) {
//            System.out.println("can't delete");
//        }









        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
    }
}
