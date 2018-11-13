package Farm;

public class Main {




    public static void main(String[] args) {


        Farm farmMade = new Farm();
        Animal lion = new Animal("lion", 30, 40);

        farmMade.breed(lion);
        for(int i = 0; i < farmMade.animalsFarm().size(); i++) {
            System.out.println(farmMade.animalsFarm().get(i).name);
        }
        System.out.println("freeplace " + farmMade.freePlace);
        System.out.println("place " + farmMade.place);

        farmMade.slaughter();
        for(int i = 0; i < farmMade.animalsFarm().size(); i++) {
            System.out.println(farmMade.animalsFarm().get(i).name);
        }




    }
}
