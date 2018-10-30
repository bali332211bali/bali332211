import java.util.Arrays;

public class matrix {


//    public static void getNumbers(int length) {
//        int[] made = new int [length];
//        for(int i = 0; i < length; i++) {
//            made[i] = i + 1;
//        }
//    }




    public static void main(String[] args) {

        int nir[][] = new int[4][4];

//        for(int i = 0; i < nir.length;i++) {
//            nir[i][i] = i;
//        }


        for (int i = 0; i < nir.length; i++) {
            for (int j = 0; j < nir[i].length; j++) {
                if (i == j) {
                nir[i][j] = 1;
                }
                System.out.print(nir[i][j] + "\t");
            }
            System.out.println();
        }


       // System.out.println(nir.length);
      //  System.out.print(Arrays.deepToString(nir));
    }

    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
}
