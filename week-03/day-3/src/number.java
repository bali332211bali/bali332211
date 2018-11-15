public class number {

    private static void add(int n, int limit) {
        if (limit >= n) {
            System.out.println(n);
            add(n+1, limit);
        }
    }

    public static void main(String[] args) {
        add(1, 6);

        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    }
}
