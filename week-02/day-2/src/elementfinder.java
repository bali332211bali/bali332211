import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class elementfinder {

    private static String containsSeven (List<Integer> list) {

        String is;

        if (list.contains(7)) {
            is = "yes";
        } else {
            is = "no";
        }
        return is;
    }

    private static String containsSeven2 (List<Integer> list) {

        String is = "";

        for (int i = 0; i<list.size();i++) {

            if (list.get(i).equals(7)) {
                is = "yes";
            } else {
                is = "no";
            }
        }

        return is;
    }



    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        System.out.println(containsSeven2(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!
    }
}
