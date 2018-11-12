import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class encoded {


    private static String value(String file, int k) {

        Path path = Paths.get(file);
        List<String> valueStart;
        String valueStr = "";

        try {
            valueStart = Files.readAllLines(path);

            for (int i = 0; i < valueStart.get(k).length(); i++) {
                if (valueStart.get(k).charAt(i) != ' ') {
                    valueStr += (char) ((int) valueStart.get(k).charAt(i)-1);
                } else {
                    valueStr += ' ';
                }

            }

        } catch (Exception a) {
            System.out.println(a);
        }

        return valueStr;
    }


    public static void main(String[] args) {



        List<String> valueStart;
        Path path = Paths.get("encoded.txt");

        List<String> value2 = new ArrayList<>();

        try {

            valueStart = Files.readAllLines(path);

            for (int i = 0; i < valueStart.size(); i++) {
                value2.add(value("encoded.txt", i));
            }

            Path path2 = Paths.get("encoded2.txt");
            Files.write(path2, value2);

            Files.lines(path2)
                    .forEach(System.out::println);

        } catch (Exception a) {
            System.out.println(a);
        }



//        char s = (char) 68;
//
//        System.out.println(s);
//
//        System.out.println((int) ' ');
//
//        System.out.println(Character.getNumericValue('U'));
//        System.out.println(Character.getNumericValue('T'));
//
//        System.out.println(Character.getNumericValue('i'));
//        System.out.println(Character.getNumericValue('h'));








        // Create a method that decrypts encoded-lines.txt
    }
}
