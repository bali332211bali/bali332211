public class Pokemon {


    String name;
    String type;

    public void effectiveAgainst(String type) {
        if (type == "water") {
            System.out.println("fire");
        } else {
            System.out.println("water");
        }


    }





    public static void main(String[] args) {


        Pokemon made = new Pokemon();
        Pokemon made2 = new Pokemon();

        made.name = "name";
        made.type = "water";

        made2.name = "name2";
        made2.type = "fire";

        made2.effectiveAgainst(made2.type);


//        Every pokemon has a name and a type. Certain types are effective against others, e.g. water is effective against fire.
//
//                You have a Pokemon class with a method called isEffectiveAgainst().
//
//                Ash has a few pokemon. Help Ash decide which Pokemon to use against the wild one.
    }
}
