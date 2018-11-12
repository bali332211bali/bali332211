import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class duplicate {



    private static String make(String file, int k) {
        List<String> duplicate = new ArrayList<>();
        String duplicateStr = "";

        try {
            Path path = Paths.get(file);
            duplicate = Files.readAllLines(path);

            for (int i = 0; i < duplicate.get(k).length()-1;i++) {
                if ( i % 2 == 0 ) {
                    duplicateStr += (duplicate.get(k).charAt(i));
                }
            }

        } catch ( Exception a) {
            System.out.println(a);
        }
        return duplicateStr;
    }




    public static void main(String[] args) {

        List<String> shortDuplicate = new ArrayList<>();

        try {
            Path path = Paths.get("duplicated-chars.txt");
            List<String> duplicate = Files.readAllLines(path);

            for (int i = 0;i<duplicate.size();i++) {
                shortDuplicate.add(make("duplicated-chars.txt", i));
            }

            Path path2 = Paths.get("duplicate2.txt");
            Files.write(path2, shortDuplicate);

            Files.lines(path2)
                    .forEach(System.out::println);

        } catch(Exception a) {
            System.out.println(a);
        }


        // Create a method that decrypts the duplicated-chars.txt
    }
}
