package sharpie;

import org.omg.CORBA.ARG_IN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sharpie {

    String color;
    float width;
    float inkAmount = 100;
    String name;

    List<Sharpie> sharpies;


//    Sharpie() {
//        sharpies.add(this.sharpies);
//    }

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
