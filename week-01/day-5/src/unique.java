import java.util.Arrays;

public class unique {

//    public static void uniqueValues(int[] a) {
//        for (int i = 0; i<a.length;i++) {
//            boolean unique = false;
//            for (int j = 0; j < i; j++) {
//                if (a[i] == a[j]) {
//                    unique = true;
//                    break;
//                }
//                if (!unique) {
//                    System.out.print(a[i] + " ");
//                }
//            }
//        }
//    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 2, 2};
        Arrays.sort(numbers);
//        uniqueValues(numbers);

        System.out.print(Arrays.toString(numbers));
        System.out.println();
        System.out.println();


       for (int i = 0; i<numbers.length;i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] != numbers[j]) {
                    System.out.print(numbers[i] + " ");
                }
           }
        }








        //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once
    //  Example
     //       System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

    }
}
