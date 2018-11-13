package sharpie;

import java.util.ArrayList;
import java.util.List;

public class Sharpie {

    String color;
    float width;
    float inkAmount = 100;
    String name;


    static List<Sharpie> initializeSharpies() {
        List<Sharpie> sharpies = new ArrayList<>();
        sharpies.add(new Sharpie("blade", 5));
        sharpies.add(new Sharpie("blade2",4));
        sharpies.add(new Sharpie("blade3",1));
        sharpies.add(new Sharpie("blade4",6));
        sharpies.add(new Sharpie("blade5",2));
        sharpies.add(new Sharpie("blade6",7));
        return sharpies;
    }


    Sharpie() {

    }

    Sharpie(int inkAmount) {
        this.inkAmount = inkAmount;
    }

    Sharpie(String name, int inkAmount) {
        this.name = name;
        this.inkAmount = inkAmount;
    }


    public float getInk() {
        return this.inkAmount;
    }

    public void use() {
        inkAmount--;
    }





//    Create sharpie.Sharpie class
//
//    We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
//    When creating one, we need to specify the color and the width
//    Every sharpie is created with a default 100 as inkAmount
//    We can use() the sharpie objects
//    which decreases inkAmount

}
