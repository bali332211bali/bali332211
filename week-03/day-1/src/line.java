
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class line {



    public static void main(String[] args) {


        try {
            Path path = Paths.get("my-file.txt");
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines);

        } catch ( Exception b) {
            System.out.println(b);
        }


        try {
            List<String> put = new ArrayList<>();
            put.add("added");

            Path path2 = Paths.get("src/file.txt");
            Files.write(path2, put);
            List<String> lines2 = Files.readAllLines(path2);
            System.out.println(lines2);

        } catch (Exception a) {
            System.out.println(a);
        }

        try {
            Path path2 = Paths.get("src/file.txt");
            Files.deleteIfExists(path2);
            System.out.println("deleted");
        } catch (Exception c) {
            System.out.println(c);
        }











        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"

    }
}
