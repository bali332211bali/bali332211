import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class logs {


    private static List<String> address(String str) {

        List<String> strAddress = new ArrayList<>();

        try {
            Path path = Paths.get(str);
            Files.readAllLines(path);
            Files.lines(path)
                    .forEach(str2 -> strAddress.add(str2.substring(27,38)));
        } catch (Exception a) {
            System.out.println(a);
        }

        return strAddress;
    }


    private static double get(String str) {

        List<String> strGet = new ArrayList<>();

        try {
            Path path = Paths.get(str);
            Files.lines(path)
                    .filter(str2 -> str2.endsWith("GET /"))
                    .forEach(str2 -> strGet.add(str2));
        } catch (Exception a) {
            System.out.println(a);
        }

        List<String> strPost = new ArrayList<>();

        try {
            Path path = Paths.get(str);
            Files.lines(path)
                    .filter(str2 -> str2.endsWith("POST /"))
                    .forEach(str2 -> strPost.add(str2));
        } catch (Exception a) {
            System.out.println(a);
        }



        return (double) strGet.size()/strPost.size();
    }



    public static void main(String[] args) {


//
//        copy.delete("file.txt");
//        copy.delete("file2.txt");


        System.out.println(address("log.txt"));
        System.out.println(new DecimalFormat("#.##").format(get("log.txt")));





//        try {
//            Path path = Paths.get("log.txt");
//            List<String> str = Files.readAllLines(path);
//
//
//
//
//            Files.lines(path)
//                    .forEach(str2 -> System.out.println(str2.indexOf()));
//
//        } catch (Exception a) {
//
//            System.out.println(a);
//        }








        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP addresses.
        // Write a function that returns the GET / POST request ratio.
    }
}
