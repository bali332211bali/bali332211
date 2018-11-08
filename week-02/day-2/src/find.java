import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.get;

public class find {

    private static List<List<Integer>> split(int[] numbers) {

        List<List<Integer>> numbers2 = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {

            numbers2.add(new ArrayList<>());
            while (numbers[i] > 0) {
                numbers2.get(i).add(numbers[i] % 10);
                numbers[i] = numbers[i] / 10;
            }
        }
        return numbers2;
    }



    private static List<Integer> subInt(int x, int[] numbers) {

        List<List<Integer>> numbersSplit = split(numbers);
        List<Integer> numbers2 = new ArrayList<>();

        for(int i = 0; i < numbersSplit.size(); i++) {
            if (numbersSplit.get(i).contains(x)) {
               numbers2.add((numbersSplit.indexOf(numbersSplit.get(i))));
           }
        }
        return numbers2;
    }

    public static void main(String[] args) {

        System.out.println(split(new int[] {1, 11, 34, 52, 61}));

        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));

        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list
        //  Example:
        //  should print: `[0, 1, 4]`
        //  should print: '[]'

    }
}
