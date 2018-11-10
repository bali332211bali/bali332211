import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class write {


    public static void main(String[] args) {

        try {
            List<String> str = new ArrayList<>();
            str.add("agregDSHAdgd");

            Path path = Paths.get("file.txt");
            Files.write(path, str);

            Files.lines(path)
                    .map(str2 -> str2.toLowerCase())
                    .forEach(str3 -> System.out.println(str3));


        } catch (Exception a) {

            System.out.println(a);
        }





        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
    }
}
