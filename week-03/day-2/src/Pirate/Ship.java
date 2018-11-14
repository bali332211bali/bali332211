package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    String name;


    List<Pirates> piratesOnShip = new ArrayList<>();


    Ship() {


    }



    void chooseCaptain() {

        for(int i = 0; i < piratesOnShip.size(); i++) {
            if (piratesOnShip.get(i).alive) {
                piratesOnShip.get(0).makeCaptain();
                break;
            }
        }

    }

    List<Pirates> piratesOnShip() {
        return piratesOnShip;
    }

    void piratesDetails() {
        System.out.println(piratesOnShip.size() + " pirates on " + this);
        System.out.println();

        for(int i = 0; i < piratesOnShip.size(); i++) {
            if (piratesOnShip.get(i).captain) {
                System.out.println("Captain " + piratesOnShip.get(i).name);
                System.out.println("intoxicated with " + piratesOnShip.get(i).intoxicated);
                if (piratesOnShip.get(i).alive) {
                    System.out.println("alive");
                } else {
                    System.out.println("dead");
                }
                if (piratesOnShip.get(i).awake) {
                    System.out.println("awake");
                } else {
                    System.out.println("asleep");
                }
                System.out.println();
            } else {
                System.out.println(piratesOnShip.get(i).name);
                if (piratesOnShip.get(i).intoxicated == 0) {
                    System.out.println("not intoxicated");
                } else {
                    System.out.println("intoxicated with " + piratesOnShip.get(i).intoxicated);
                }
                if (piratesOnShip.get(i).alive) {
                    System.out.println("alive");
                } else {
                    System.out.println("dead");
                }
                if (piratesOnShip.get(i).awake) {
                    System.out.println("awake");
                } else {
                    System.out.println("asleep");
                }
                System.out.println();
            }

        }
    }


    void addPirates(Pirates pirate) {
        piratesOnShip.add(pirate);
    }

    void fillShip() {
        int a = (int)(Math.random()*10)+2;
        PiratesNames piratesNames = new PiratesNames();
        for(int i = 0; i < a; i++) {
            piratesOnShip.add(new Pirates(piratesNames.pirateNames().get(i)));
        }
        chooseCaptain();
    }





}
