public class power {


    private static int power(int n, int k) {
        if (n >= 1 && k > 1) {
            return power(n, k-1) * n;
        }
        return n;
    }

    public static void main(String[] args) {


        System.out.println(power(2,1));

        // Given base and n that are both 1 or more, compute recursively (no loops)
        // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    }
}
