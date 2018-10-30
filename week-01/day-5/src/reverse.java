public class reverse {



    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int temp;

        for(int i = 0; i<aj.length/2; i++) {
            temp = aj[i];
            aj[i] = aj[aj.length-i-1];
            aj[aj.length-i-1] = temp;
        }

        for(int i = 0; i<aj.length; i++) {
            System.out.print(aj[i] + "\t");
        }
    }

    // - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
}
