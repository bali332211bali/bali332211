import java.util.Arrays;
//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example
//    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]`

public class unique3 {
    public static void findUnique(int[] a) {
        for(int i=0; i < a.length; i++) {
            boolean isUnique = false;

            for(int j=0; j < i; j++) {
                if(a[i] == a[j]) {
                    isUnique = true;
                    break;
                }
            }
            if(!isUnique) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 11, 34, 11, 52, 61, 1, 34};
        Arrays.sort(arr);
        findUnique(arr);
    }
}