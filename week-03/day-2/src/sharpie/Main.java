package sharpie;

public class Main {

    public static void main(String[] args) {



        SharpieSet sharpieset = new SharpieSet();

        Sharpie blade = new Sharpie();
        Sharpie blade2 = new Sharpie();
        Sharpie blade3 = new Sharpie();

        for(int i = 0; i < 5; i++) {
            blade2.use();
        }
        blade3.inkAmount = 0;

        blade.use();
        System.out.println(blade.inkAmount);
        System.out.println(blade2.inkAmount);
        System.out.println(blade3.inkAmount);

    }




}
