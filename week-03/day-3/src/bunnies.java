public class bunnies {

    private static int bunnies(int n, int k) {
        if (n > 1) {
            return bunnies(n-1, k) + k;
        }
        return k;
    }


    public static void main(String[] args) {

        System.out.println(bunnies(4, 2));

        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    }
}
