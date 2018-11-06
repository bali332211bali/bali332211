import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class quote {

    private static List<String> quoteSwap (List<String> list) {

//        List<String> list2 = new ArrayList<>(Collections.emptyList());
//        Collections.swap(list, list.indexOf("I"), list.indexOf("What"));

        list.add(0, list.get(4));
        list.remove(5);

        int cannot = list.indexOf("cannot");
        list.add(1, list.get(list.indexOf("cannot")));
        list.remove(cannot+1);

        int create = list.indexOf("create");
        list.add(2, list.get(list.indexOf("create")));
        list.remove(create+1);

        return list;



    }

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create", "I", "cannot", "not", "understand."));
        System.out.println(quoteSwap(list));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.

        // Expected output: "What I cannot create I do not understand."
    }
}
