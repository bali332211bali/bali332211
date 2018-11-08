import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class josephusproblem {

    private static List<Integer> added(int number) {
        List<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            numbers2.add(i+1);
        }
        return numbers2;
    }

    private static List<Integer> remove(List<Integer> numbers) {

        List<Integer> numbers2 = new ArrayList<>();

        if (numbers.size() % 2 == 0) {
            for(int i = 0; i < numbers.size();i++) {
                if (i % 2 == 0) {
                    numbers2.add(numbers.get(i));
                }
            }

        } else {
            numbers2.add(numbers.get(numbers.size()-1));
            for (int i = 0; i < numbers.size()-1; i++) {
                if (i % 2 == 0) {
                    numbers2.add(numbers.get(i));
                }
            }

        }
        return numbers2;
    }





    public static void main(String[] args) {

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        List<Integer> numbers = added(user);

        while (numbers.size() > 1) {
            numbers = remove(numbers);
        }
        System.out.println(numbers.get(0));










    }
}
