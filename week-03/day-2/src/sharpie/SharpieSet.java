package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {


    static List<Sharpie> sharpies = Sharpie.initializeSharpies();



    public static List<Sharpie> sharpies2() {
        return sharpies;
    }

    public static List<Sharpie> countUsable() {
        List<Sharpie> usable = new ArrayList<>();

        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).getInk() > 0) {
                usable.add(sharpies.get(i));
            }
        }
        return usable;
    }

    public static void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).getInk() == 0) {
                sharpies.remove(i);
            }
        }

    }


//    Reuse your sharpie.Sharpie class
//    Create sharpie.SharpieSet class
//    it contains a list of sharpie.Sharpie
//                    countUsable() -> sharpie is usable if it has ink in it
//    removeTrash() -> removes all unusable sharpies


}
