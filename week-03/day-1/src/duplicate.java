import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class duplicate {




    public static void remove(String file) {

        try {
            Path path = Paths.get(file);
            List<String> duplicate = Files.readAllLines(path);
            String duplicateStr = "";


            List<String> shortDuplicate = new ArrayList<>();

            String str2 = "";
            int count = 0;
            String str = "";
            for (String strAdd : duplicate) {
                str += strAdd;
                count++;
                if (count % 2 == 1) {
                    str2 += str.charAt(count);
                }

                shortDuplicate.add(str2);

            }


            System.out.println(str2);



//            int count = 0;
//            for (String addStr : duplicate) {
//                count++;
//                if (count % 2 == 1) {
//                    duplicate.remove(duplicate.get(count));
//                }
//            }



//
//            Files.lines(path)
//                    .forEach(str -> System.out.println(str));



        } catch (Exception a) {
            System.out.println(a);
        }


    }

    public static void main(String[] args) {



        remove("duplicated-chars.txt");

        // Create a method that decrypts the duplicated-chars.txt
    }
}
