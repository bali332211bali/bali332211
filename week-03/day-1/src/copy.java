import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class copy {

    public static void delete(String file) {
        try {
            Path path2 = Paths.get(file);
            Files.deleteIfExists(path2);
            System.out.println("deleted");
        } catch (Exception c) {
            System.out.println("can't delete");
        }
        System.out.println();

    }



    public static boolean copy(String file, String file2) {
        try {
            Files.copy(Paths.get(file),Paths.get(file2));
            return true;
        } catch (Exception a) {
            System.out.println(a);
            return false;
        }
    }







    public static void main(String[] args) {


        delete("file.txt");
        delete("file2.txt");



        List<String> str = new ArrayList<>();
        str.add("asdgrhg");
        str.add("adhgjhgjhsdgrhg");

        try {
            Path path = Paths.get("file.txt");
            Files.write(path, str );
        } catch ( Exception a) {
            System.out.println(a);
        }


//        List<String> str2 = new ArrayList<>();
//        str2.add("asdgrhg");
//        str2.add("ahg");
//        str2.add("adhdsdafsdfadsfgrhg");
//        str2.add("adhgjhgjhsdgrsdafdahg");
//
//        try {
//            Path path2 = Paths.get("file2.txt");
//            Files.write(path2, str2 );
//
//
//        } catch ( Exception a) {
//            System.out.println(a);
//        }






        copy("file.txt", "file2.txt");

        try {
            Files.lines(Paths.get("file.txt")).forEach(str3 -> System.out.println(str3));
            System.out.println();
            System.out.println();
            System.out.println();
            Files.lines(Paths.get("file2.txt")).forEach(str4 -> System.out.println(str4));

        } catch(Exception b) {
            System.out.println(b);
        }








        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
    }
}
