import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class anagram {



    public static void main(String[] args) {

        System.out.println("String");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();

        System.out.println("another");
        Scanner scanner2 = new Scanner(System.in);
        String user2 = scanner2.nextLine();

//        boolean is = false;
//        if (user.contains(user2) && user.length() > 2) {
//
//            is = true;
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        boolean start = true;
        if (start == true) {
            for(int i = 0; i < user.length(); i++) {
                for(int j = user.length()-1; j >= 0;j--) {
                    if (user.charAt(i) == user2.charAt(j)) {
                        if (i < user.length() - 1) {
                            i++;
                        }
                    } else {
                        start = false;

                    }

                }
            }
        }

        if (start == false) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }



//        Pattern pattern = Pattern.compile(user2-zA-Z);
//
//        Matcher matcher = pattern.matcher(user);
//
//        if (matcher.matches()) {
//            System.out.println("string '"+user + "' true");
//        } else {
//            System.out.println("string '"+user + "' false");
//        }





    }


}
