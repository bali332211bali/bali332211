public class number {

    private static void add(int n, int limit) {
        if (limit >= n) {
            System.out.println(n);
            add(n+1, limit);
        }
    }

    private static void add2(int n) {
        if (n > 1) {
            add2(n-1);
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        add(1, 6);
        System.out.println();
        add2(6);

        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    }
}
