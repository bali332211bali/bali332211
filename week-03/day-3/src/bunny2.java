public class bunny2 {

    private static int bunnies(int n, int k, int l) {

        if (n > 1) {
            if (n % 2 == 0) {
                return bunnies(n-1, k, l) + k;
            } else {
                return bunnies(n-1, k, l) + l;
            }
        }
        if (n % 2 == 0) {
            return k;
        } else {
            return l;
        }

    }

    public static void main(String[] args) {

        System.out.println(bunnies(4, 3, 2));


        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
        // have 3 ears, because they each have a raised foot. Recursively return the
        // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    }
}
