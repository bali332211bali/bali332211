public class number {


    private static int add(int n) {
        if(n == 1) {
            return 1;
        } else {
            return add(n-1) + n;
        }
    }


    private static int add2(int n) {
        if (n > 1) {
            return add2(n-1) + n;
        }
        return n-1+n;
    }

    private static void add3(int n) {
        if (n > 1) {
            add3(n-1);
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.println(add(6));
        System.out.println();
        System.out.println(add2(6));
        System.out.println();

        add3(6);
        System.out.println();
        System.out.println();


        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    }
}
