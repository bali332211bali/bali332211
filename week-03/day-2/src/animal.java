public class animal {


    int hunger = 50;
    int thirst = 50;

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


    public static void main(String[] args) {

        animal lion = new animal();
        System.out.println(lion.hunger);

        lion.eat();
        lion.play();
        System.out.println(lion.hunger);
        System.out.println(lion.thirst);

    }






//    Create an Animal class
//
//    Every animal has a hunger value, which is a whole number
//                    Every animal has a thirst value, which is a whole number
//                    when creating a new animal object these values are created with the default 50 value
//    Every animal can eat() which decreases their hunger by one
//    Every animal can drink() which decreases their thirst by one
//    Every animal can play() which increases both by one

}
