import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class duplicate {



    private static void make(String file, int k) {

        try {
            Path path = Paths.get(file);
            List<String> duplicate = Files.readAllLines(path);
            String duplicateStr = "";
            for (int i = 0; i < duplicate.get(k).length()-1;i++) {
                if ( i % 2 == 0 ) {
                    duplicateStr += (duplicate.get(0).charAt(i));
                }
            }
            duplicate.add(duplicateStr);

        } catch ( Exception a) {
            System.out.println(a);
        }




    }








    public static void remove(String file) {

        try {
            Path path = Paths.get(file);
            List<String> duplicate = Files.readAllLines(path);



            List<String> shortDuplicate = new ArrayList<>();

            String duplicateStr = "";
            for (int i = 0; i < duplicate.get(0).length()-1;i++) {
                if ( i % 2 == 0 ) {
                    duplicateStr += (duplicate.get(0).charAt(i));
                }
            }
            shortDuplicate.add(duplicateStr);


            duplicateStr = "";
            for (int i = 0; i < duplicate.get(1).length()-1;i++) {
                if ( i % 2 == 0 ) {
                    duplicateStr += (duplicate.get(1).charAt(i));
                }
            }
            shortDuplicate.add(duplicateStr);



            Path path2 = Paths.get("duplicate2.txt");
            Files.write(path2, shortDuplicate);

            Files.lines(path2)
                    .forEach(strPath2 -> System.out.println(strPath2));

            //System.out.println(shortDuplicate);



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
