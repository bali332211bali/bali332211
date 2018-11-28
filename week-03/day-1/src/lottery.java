import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lottery {



    private static List<String> lottery(String file) {

        Path path = Paths.get(file);
        List<String> lotteryAll = new ArrayList<>();

        try {
                Files.lines(path)
                        .forEach(str -> lotteryAll.add(str.substring(str.lastIndexOf("Ft;"), str.length()-1)));
        } catch (Exception a) {
            System.out.println(a);
        }
        return lotteryAll;
    }




    private static String  onlyNumbers(List<String> strings, int k) {

        String lotteryStr = "";
        for(int i = 0; i < strings.get(k).length(); i++) {
            if ((char) ((int) strings.get(k).charAt(i)) < 59) {
                lotteryStr += strings.get(k).charAt(i);
            } else if ((char) ((int) strings.get(k).charAt(i)) == 59) {
                lotteryStr += " ";
          } else {

            }
        }
        return lotteryStr;
    }



    private static void lotteryInt(List<String> strings, int k) {

        for (int i = 0; i < strings.get(k).length(); i++) {

            if ((char) ((int) strings.get(k).charAt(i)) > 32) {

                strings.get(k).split(" ");

            }


        }
    }



    public static void main(String[] args) {

        List<String> lotteryNumbers = lottery("lottery.txt");
        String lotteryStr = "";
        List<String> lotteryAll = new ArrayList<>();



        char s = (char) 68;
        System.out.println(s);

        System.out.println((int) ';');
        System.out.println((int) '0');
        System.out.println((int) 't');
        System.out.println((int) ' ');

        try {

            for (int i = 0; i < lotteryNumbers.size(); i++) {
                lotteryAll.add(onlyNumbers(lotteryNumbers, i));
            }

//            for (int i = 0; i < lotteryAll.size(); i++) {
//                lotteryInt(lotteryAll, i);
//            }

            String[] numbers = lotteryAll.get(0).split(" ");



//            for(int i = 0; i < lotteryNumbers.get(0).length(); i++) {
//                if (lotteryNumbers.get(0).charAt(i) % 1 == 0) {
//                    lotteryStr += lotteryNumbers.get(0).charAt(i);
//                }
//
//            }




            Path path2 = Paths.get("lottery2.txt");
            Files.write(path2, lotteryAll);

            Files.lines(path2)
                    .forEach(System.out::println);


        } catch (Exception a) {
            System.out.println(a);
        }




//        try {
//            Path path2 = Paths.get("lottery2.txt");
//            Files.write(path2, lottery("lottery.txt"));
//
//
//
//            Files.lines(path2)
//                    .forEach(System.out::println);
//
//        } catch (Exception a) {
//            System.out.println(a);
//        }






//        2015;48;2015.11.28.;
//        0;0 Ft;
//        21;2 670 505 Ft;
//        2403;24 710 Ft;
//        75831;1 525 Ft;
//        9;50;72;76;89

//        1958;42;;
//        0;0 Ft;
//        0;0 Ft;
//        0;0 Ft;
//        0;0 Ft;
//        4;17;38;67;74

        // Create a method that finds the 5 most common lottery numbers in lottery.csv
    }
}
