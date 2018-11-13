package sharpie;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        SharpieSet.sharpies.get(2).use();


        for(int i = 0; i < SharpieSet.countUsable().size(); i++) {
            System.out.println(SharpieSet.countUsable().get(i).name);
        }

        SharpieSet.removeTrash();

        for(int i = 0; i < SharpieSet.sharpies2().size(); i++) {
            System.out.println(SharpieSet.sharpies2().get(i).name);
        }

//        System.out.println(SharpieSet.countUsable());






//        Sharpie blade = new Sharpie(30);
//        Sharpie blade2 = new Sharpie(20);
//        Sharpie blade3 = new Sharpie(60);

//        for(int i = 0; i < 5; i++) {
//            blade2.use();
//        }
//        blade3.inkAmount = 0;
//
//        blade.use();
//        System.out.println(blade.inkAmount);
//        System.out.println(blade2.inkAmount);
//        System.out.println(blade3.inkAmount);
    }




}
