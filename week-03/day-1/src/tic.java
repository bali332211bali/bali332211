import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class tic {



    private static void ticTacResult(String file) {


        try {

            Path path = Paths.get(file);
            List<String> str2 = new ArrayList<>();

            Files.lines(path)
                    .forEach(str2::add);


            String str = "";
            for (String strAdd : str2) {
                str += strAdd;
            }

            String result = "";

            if (str.charAt(0) == str.charAt(3) && str.charAt(3) == str.charAt(6)) {
                result += str.charAt(0);
                result += str.charAt(3);
                result += str.charAt(6);
            } else if (str.charAt(2) == str.charAt(5) && str.charAt(5) == str.charAt(8)) {
                result += str.charAt(2);
                result += str.charAt(5);
                result += str.charAt(8);

            } else if (str.charAt(0) == str.charAt(4) && str.charAt(4) == str.charAt(8)) {
                result += str.charAt(0);
                result += str.charAt(4);
                result += str.charAt(8);
                result += str.charAt(8);

            } else {
                System.out.println("draw");
            }

            if (result.contains("XXX")) {
                System.out.println("x");
            }
            if (result.contains("OOO")) {
                System.out.println("o");
            }


        } catch (Exception a) {
            System.out.println(a);
        }

    }





    public static void main(String[] args) {

        ticTacResult("win-o.txt");
        ticTacResult("win-x.txt");
        ticTacResult("draw.txt");







        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

//        System.out.println(ticTacResult("win-o.txt"))
        // Should print "O"

//        System.out.println(ticTacResult("win-x.txt"))
        // Should print "X"

//        System.out.println(ticTacResult("draw.txt"))
        // Should print "Draw"
    }
}
