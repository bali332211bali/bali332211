public class refactorio {

    private static int fact(int n) {
        if (n > 1) {
            return fact(n-1) * n;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
