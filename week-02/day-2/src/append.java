import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class append {

    private static List<String> appendA (List<String> list) {
        List<String> list2 = new ArrayList<>(Collections.emptyList());

        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i)+"a");
        }
        return list2;
    }

    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        System.out.println(appendA(far));

        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.


    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"
