import java.util.ArrayList;
import java.util.List;

public class candy {


    private static List<Object> sweets (List<Object> list) {

        for (int i =0; i < list.size();i++) {
            if (list.get(i).equals(2)) {
                list.set(i, "Croissant");
            }
            if (list.get(i).equals(false)) {
                list.set(i, "Ice cream");
            }
        }
        return list;

    }
    public static void main(String[] args) {


        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.


        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }
}
