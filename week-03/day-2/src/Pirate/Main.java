package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//        List<Pirates> piratesAll = initializePirates();
//        List<Ship> shipsAll = initializeShips();
//
//        for(int i = 0; i < 10; i++) {
//            shipsAll.get(0).addPirates(piratesAll.get(i));
//        }
//
//        shipNumber(0).makeCaptain();

      //  PiratesNames pirateNames = new PiratesNames();






        List<Pirates> piratesOnShip;

        List<Ship> ships = initializeShips();
//        List<Pirates> piratesAll = initializePirates();


        ships.get(0).fillShip();

        ships.get(0).piratesOnShip().get(0).brawl(ships.get(0).piratesOnShip().get(1));

        ships.get(0).piratesOnShip().get(0).howsItGoingMate();
        ships.get(0).piratesOnShip().get(1).howsItGoingMate();

        System.out.println();

        for(int i = 0; i < ships.get(0).piratesOnShip().size(); i++) {
            System.out.println(ships.get(0).piratesOnShip().get(i).name);
        }

        System.out.println();
        ships.get(0).piratesDetails();










    }




//     static Ship shipNumber(int number) {
//        return shipsAll.get(number);
//    }

//    static Pirates piratesNumber(int number) {
//        return initializePirates().get(number);
//    }
//
//    static List<Pirates> initializePirates() {
//        List<Pirates> piratesStart = new ArrayList<>();
//        for(int i = 0; i < 30; i++) {
//            piratesStart.add(new Pirates(PiratesNames.pirateNames().get(i)));
//        }
//        return piratesStart;
//    }

    static List<Ship> initializeShips() {
        List<Ship> shipStart = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            shipStart.add(new Ship());
        }
        return shipStart;
    }
}
