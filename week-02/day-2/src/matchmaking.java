import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class matchmaking {

    private static List<String> makingMatches (List<String> list, List<String> list2) {
        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList());
        for (int i = 0; i < list.size(); i++) {
            list3.add(list.get(i));
            list3.add(list2.get(i));
        }
        return list3;
    }

    public static void main(String[] args) {


        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Expected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
}
