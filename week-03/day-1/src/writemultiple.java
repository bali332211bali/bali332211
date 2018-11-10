import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class writemultiple {

    private static void file(String file, String str, int number) {

        List<String> str2 = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            str2.add(str);
        }

        try {
            Path path = Paths.get(file);
            Files.write(path, str2);

        } catch (Exception a) {
            System.out.println(a);
        }

    }



    public static void main(String[] args) {


        file("file.txt", "safargg", 4);




        try {

            Files.lines(Paths.get("file.txt"))
                    .forEach(str -> System.out.println(str));


        } catch(Exception a) {
            System.out.println(a);
        }




        // Create a function that takes 3 parameters: a path, a word and a number,
        // than it should write to a file.
        // The path parameter should be a string, that describes the location of the file.
        // The word parameter should be a string, that will be written to the file as lines
        // The number parameter should describe how many lines the file should have.
        // So if the word is "apple" and the number is 5, than it should write 5 lines
        // to the file and each line should be "apple"
        // The function should not raise any error if it could not write the file.
    }
}
