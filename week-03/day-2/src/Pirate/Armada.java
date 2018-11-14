package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Armada {

    List<Ship> shipsInArmada = new ArrayList<>();
    String name;

    Armada() {

    }

    Armada(String name) {
        this.name = name;
    }



    List<Ship> ships() {
        return shipsInArmada;
    }


    void fillArmada() {
        int a = (int)(Math.random()*2)+2;
        ShipNames shipNames = new ShipNames();
        for(int i = 0; i < a; i++) {
            shipsInArmada.add(new Ship(shipNames.shipNames().get(i)));
            shipsInArmada.get(i).fillShip();
        }
    }

    void war(Armada armada) {

        boolean win = true;
        while (win) {
            for (int i = 0; i < this.shipsInArmada.size(); i++) {
                thisAgainstOther(armada, i);
                win = false;
            }
        }


//        for (int i = 0; i < armada.ships.size()-1; i++) {
//            this.ships.get(0).battle(armada.ships.get(i));
//            if (this.ships.get(0).battle(armada.ships.get(i))) {
//                this.ships.get(0).battle(armada.ships.get(i+1));
//            } else {
//                this.ships.get(i+1).battle(armada.ships.get(i));
//            }
//        }
    }

    void otherAgainstThis(Armada armada, int k) {
        for (int i = 0; i < this.shipsInArmada.size()-1; i++) {
            if (armada.shipsInArmada.get(k).battle(this.shipsInArmada.get(i))) {
                armada.shipsInArmada.get(k).battle(this.shipsInArmada.get(i));
            } else {
                break;
            }
        }
    }

    void thisAgainstOther(Armada armada, int k) {
        for (int i = 0; i < armada.shipsInArmada.size()-1; i++) {
            if (this.shipsInArmada.get(k).battle(armada.shipsInArmada.get(i))) {
                this.shipsInArmada.get(k).battle(armada.shipsInArmada.get(i));
            } else {
                break;
            }
        }
    }







    void battleArmada(Armada armada, int k) {
        for (int i = 0; i < armada.shipsInArmada.size()-1; i++) {
            this.shipsInArmada.get(k).battle(armada.shipsInArmada.get(i));
            if (this.shipsInArmada.get(k).battle(armada.shipsInArmada.get(i))) {
                this.shipsInArmada.get(k).battle(armada.shipsInArmada.get(i+1));
            } else {
                this.shipsInArmada.get(i+1).battle(armada.shipsInArmada.get(i));
            }
        }
    }




}
