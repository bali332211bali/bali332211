package Farm;


import java.util.List;

public class Farm {

    int place = 10;
    int freePlace = 10;

    static List<Animal> animalsFarm = Animal.initializeAnimals();


    public List<Animal> animalsFarm() {
        return animalsFarm;
    }

    public void breed(Animal animal) {
        freePlace = place - animalsFarm().size();
        if (freePlace > 0) {
            animalsFarm().add(animal);
            freePlace--;
        }
    }

    public void slaughter() {
        Animal a = animalsFarm().get(0);

        for(int i = 0; i < animalsFarm().size()-1; i++) {
            if(a.hunger < animalsFarm().get(i+1).hunger) {

            } else {
                a = animalsFarm().get(i+1);
            }
        }
        animalsFarm().remove(a);

    }






//    Reuse your Animal class
//    Create a Farm class
//    it has list of Animals
//                    it has slots which defines the number of free places for animals
//    breed() -> creates a new animal if there's place for it
//    slaughter() -> removes the least hungry animal
}
