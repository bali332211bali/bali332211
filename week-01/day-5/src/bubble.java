import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class bubble {
    public static List<Integer> advancedBubble(int[] numbers, boolean descending) {
        return IntStream.of(numbers)
                .boxed()
                .sorted(descending ? Comparator.reverseOrder() : Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    public static void arrange(int[] numbers, boolean descending) {
        if (!descending) {
            Arrays.sort(numbers);
            System.out.print(Arrays.toString(numbers));
        } else {
            Arrays.sort(numbers);
            for (int i = 0; i < numbers.length/2; i++) {
                int temp = numbers[i];
                numbers[i] = numbers[numbers.length-(i+1)];
                numbers[numbers.length-(i+1)] = temp;
            }

            System.out.print(Arrays.toString(numbers));
        }
    }


    public static void main(String[] args) {

        int[] given = {2, 5, 34, 58, 19};


        System.out.println(advancedBubble(given, false));

       // arrange(given, true);


    }

//    public class Bubble {
//        public static void main(String[] args) {
//            //  Create a function that takes a list of numbers as parameter
//            //  Returns a list where the elements are sorted in ascending numerical order
//            //  Make a second boolean parameter, if it's `true` sort that list descending
//
//            //  Example:
//            System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
//            //  should print [5, 9, 12, 24, 34]
//            System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
//            //  should print [34, 24, 12, 9, 5]
//        }
//    }


}
