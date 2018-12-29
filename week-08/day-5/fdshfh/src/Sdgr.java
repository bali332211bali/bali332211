public class Sdgr {




    public static boolean sameRow(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i].length != numbers.length) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {

        int[][] numbers = {{2,3,9}, {3,2,6}, {1,1,5}};

        System.out.println(Sdgr.sameRow(numbers));

    }

}
