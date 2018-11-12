import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class reversed {

    private static String reverse(String file, int k) {

        List<String> reversed;
        Path path = Paths.get(file);
        String reversedStr = "";

        try {
            reversed = Files.readAllLines(path);

            for (int i = 0; i < reversed.get(k).length()-1; i++) {
                reversedStr += (reversed.get(k).charAt(reversed.get(k).length()-1-i));
            }

        } catch(Exception a) {
            System.out.println(a);
        }

        return reversedStr;

    }




    public static void main(String[] args) {

        List<String> reversed = new ArrayList<>();
        Path path = Paths.get("reversed.txt");

        try {
            List<String> reversedStart = Files.readAllLines(path);

            for(int i = 0; i < reversedStart.size(); i++) {
                reversed.add(reverse("reversed.txt", i));

            }

            Path path2 = Paths.get("reversed2.txt");
            Files.write(path2, reversed);

            Files.lines(path2)
                    .forEach(System.out::println);

        } catch (Exception a) {
            System.out.println(a);
        }



        // Create a method that decrypts reversed-lines.txt
    }
}
