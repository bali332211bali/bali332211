public class animal {


    int hunger = 50;
    int thirst = 50;

    public int eat() {
        return hunger-1;
    }

    public int drink() {
        return thirst-1;
    }
    
    public int play() {
        return thirst-1 && hunger-1;
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
