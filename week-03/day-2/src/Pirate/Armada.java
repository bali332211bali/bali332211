package Pirate;

import java.util.List;

public class Armada {

    List<Ship> ships;
    String name;

    Armada() {

    }

    Armada(String name) {
        this.name = name;
    }



    List<Ship> ships() {
        return ships;
    }


    void fillArmada() {
        int a = (int)(Math.random()*8)+2;
        ShipNames shipNames = new ShipNames();
        for(int i = 0; i < a; i++) {
            ships.add(new Ship(shipNames.shipNames().get(i)));
        }

    }




}
