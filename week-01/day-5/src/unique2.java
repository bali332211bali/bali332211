import java.util.Arrays;

public class unique2 {

    public static void list(int[] numbers) {

        for (int i = 0; i<numbers.length;i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] != numbers[j]) && (i >= numbers.length -2)) {
                    System.out.print(numbers[i] + " ");
                    System.out.print(numbers[i+1] + " ");
                    i++;
                } else if ((numbers[i] != numbers[j])) {
                    System.out.print(numbers[i] + " ");
                    i++;
                } else {
                    i++;
                }
            }
        }


    }




    public static int count(int[] numbers) {
        int count = 0;

        for (int i = 0; i<numbers.length;i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] != numbers[j]) && (i >= numbers.length -2)) {
                    count++;
                    count++;
                    i++;
                } else if ((numbers[i] != numbers[j])) {
                    count++;
                    i++;
                } else {
                    i++;
                }
            }
        }
        return count;
    }




    public static void givenShort(int[] numbers, int length) {

        int[] made = new int [length];
        int l = 0;

        for (int i = 0; i<numbers.length;i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] != numbers[j]) && (i >= numbers.length -2)) {
                    made[l] = numbers[i];
                    made[l+1] = numbers[i+1];
                    i++;
                    l +=2;
                } else if ((numbers[i] != numbers[j])) {
                    made[l] = numbers[i];
                    i++;
                    l++;
                } else {
                    i++;
                }
            }
        }
        System.out.print(Arrays.toString(made));


    }





    public static void main(String[] args) {
        int[] given = {1, 1, 1, 2, 3, 3, 3, 2, 2, 3, 4};
        Arrays.sort(given);

        System.out.print(Arrays.toString(given));
        System.out.println();
        System.out.println();

        list(given);
        System.out.println();
        System.out.println();

        count(given);
        givenShort(given, count(given));








        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once
        //  Example
        //       System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

    }
}
