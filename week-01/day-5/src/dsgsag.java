import java.util.Arrays;
import java.util.Scanner;

public class dsgsag {
    public static void main(String[] args) {

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        ;

        int[] numbers = {1, 3, 5, 6};

        System.out.println(numbers[0]);


        int[] numbers2 = {1, 2, 54};

        int[] numbers4;
        numbers4 = new int[4];
        numbers4[0] = 54;

        for (int element : numbers) {
            System.out.println(element);
        }

        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] numbers3 = Arrays.copyOf(numbers, 0);
        System.out.println(Arrays.toString(numbers));


        int[] numbers5 = {3, 7};
        int[][] numbers6 = {{3, 7}, {3, 7}};
        System.out.println(numbers6[1][1]);









    }





    public static void print(int[] numbers10) {
        for (int number : numbers10) {
            System.out.println(number);
        }
    }


    public static void getNumbers(int length) {
        int[] made = new int [length];
        for(int i = 0; i < length; i++) {
            made[i] = i + 1;
        }
    }




}
