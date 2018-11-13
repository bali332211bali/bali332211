package Farm;

import java.util.ArrayList;
import java.util.List;

public class Animal {


    String name;
    int hunger = 50;
    int thirst = 50;

    Animal(int hunger, int thirst) {
       // this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    Animal(String name, int hunger, int thirst) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }

    public void play() {
        hunger--;
        thirst--;

    }




    static List<Animal> initializeAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cow",5, 2));
        animals.add(new Animal("cow2",4, 6));
        animals.add(new Animal("cow3",1, 5));
        animals.add(new Animal("cow4",6, 7));
        animals.add(new Animal("cow5",2, 4));
        animals.add(new Animal("cow6",7, 1));
        return animals;
    }

    static List<Animal> more() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal((int) (Math.random()*50), (int) (Math.random()*50)));
        return animals;
    }






//    Create an Animal class
//
//    Every Farm.animal has a hunger value, which is a whole number
//                    Every Farm.animal has a thirst value, which is a whole number
//                    when creating a new Farm.animal object these values are created with the default 50 value
//    Every Farm.animal can eat() which decreases their hunger by one
//    Every Farm.animal can drink() which decreases their thirst by one
//    Every Farm.animal can play() which increases both by one

}
