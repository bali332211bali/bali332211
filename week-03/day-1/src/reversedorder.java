import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class reversedorder {


    private static String reverseOrder(String file, int k) {


        List<String> reverseStart;
        Path path = Paths.get(file);
        String reversedStr = "";

        try {
            reverseStart = Files.readAllLines(path);

            for (int i = 0; i < reverseStart.get(k).length()-1; i++) {
                reversedStr += reverseStart.get(k).charAt(i);
            }

        } catch (Exception a) {
            System.out.println(a);
        }

        return reversedStr;


    }


    public static void main(String[] args) {

        List<String> reversedStart;
        Path path = Paths.get("reversedorder.txt");

        List<String> reversed2 = new ArrayList<>();

        try {

            reversedStart = Files.readAllLines(path);

            for (int i = 0; i < reversedStart.size(); i++) {
                reversed2.add(reverseOrder("reversedorder.txt", reversedStart.size()-1-i));
            }

            Path path2 = Paths.get("reversedorder2.txt");
            Files.write(path2, reversed2);

            Files.lines(path2)
                    .forEach(System.out::println);



        } catch (Exception a) {
            System.out.println(a);
        }

        // Create a method that decrypts reversed-order.txt
    }
}
