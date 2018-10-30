public class factorial {

    public static long factorio(int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }



    public static void main(String[] args) {

        System.out.println(factorio(4));
    }

// - Create a function called `factorio`
//   that returns it's input's factorial
}
