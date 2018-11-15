public class sum {

    private static int add(int n) {

        if (n / 10 > 0) {
            return add(n / 10) + n % 10;
        }
        return n;
    }





    public static void main(String[] args) {
        System.out.println(add(126));
        // Given a non-negative int n, return the sum of its digits recursively (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
        // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    }
}
