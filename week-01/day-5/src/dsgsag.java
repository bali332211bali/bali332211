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


}
