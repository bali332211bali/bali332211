public class counter {

    public static int count(int n) {
        if (n <= 0) {
            System.out.println(n);
            return 0;
        } else {
            System.out.println(n);
            return count(n-1);
        }
    }

    public static void count2(int n) {
        System.out.println(n);
        if (n > 0) {
            count2(n-1);
        }
    }

    public static void count3(int n, int limit) {
        System.out.println(n);
        if (n < limit) {
            count3(n+1,limit);
        }
    }

    public static void main(String[] args) {


        count(10);
        System.out.println();
        count2(10);
        System.out.println();
        count3(0,10);







    // Write a recursive function that takes one parameter: n and counts down from n.
    }
}
