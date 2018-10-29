public class even {
    public static void main(String[] args) {
        // Create a program that prints all the even numbers between 0 and 500

        for (int a = 0; a <= 500; a++) {
            if ((a != 0) && (a % 2 == 0)) {
                System.out.println(a);
            }
        }

    }
}
