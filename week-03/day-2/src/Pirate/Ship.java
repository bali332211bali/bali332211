package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    String name;
    static int names;


    List<Pirates> piratesOnShip = new ArrayList<>();


    Ship() {

    }

    Ship(String name) {
        this.name = name;

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

    int piratesAlive() {
        int count = 0;
        for (int i = 0; i < piratesOnShip.size(); i++) {
            if (piratesOnShip.get(i).alive) {
                count++;
            }
        }
        return count;
    }



    Pirates getCaptain() {
        Pirates a = null;
        for (int i = 0; i < this.piratesOnShip.size(); i++) {
            if (this.piratesOnShip.get(i).captain) {
                a = this.piratesOnShip.get(i);
            }
        }
        return a;
    }


    void piratesDetails() {
        System.out.println("-------------"+ this.name + "---------------");
        System.out.println(piratesOnShip.size() + " pirates");
        System.out.println(this.piratesAlive() + " pirates alive");
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
        System.out.println("---------------------------------");
    }


    void fillShip() {
        names++;
        int a = (int)(Math.random()*10)+2;
        PiratesNames piratesNames = new PiratesNames();
        for(int i = 0; i < a; i++) {
            piratesOnShip.add(new Pirates(piratesNames.pirateNames().get(i)));
        }
        chooseCaptain();
    }

    void piratesStart() {
        System.out.println(piratesOnShip.size());
    }

    void win() {
        for (int i = 0; i < this.piratesOnShip.size() ; i++) {
            if (piratesOnShip.get(i).alive) {
                piratesOnShip.get(i).intoxicated += (int) (Math.random()*3);
                piratesOnShip.get(i).intoxicatedSleep();
            }
        }
    }

    void lose(Ship ship) {
        int die = (int) (Math.random()*ship.piratesAlive());
        int dieStart = die;
        for (int i = 0; i < ship.piratesOnShip.size() ; i++) {
            if (ship.piratesOnShip.get(i).alive && die >= 1) {
                ship.piratesOnShip.get(i).alive = false;
                die--;
            }
        }
    }


    boolean battle(Ship ship) {
       int thisStrength = this.piratesAlive() + getCaptain().intoxicated;
       int shipStrength = ship.piratesAlive() + ship.getCaptain().intoxicated;
       if (thisStrength > shipStrength) {
           int die = (int) (Math.random()*ship.piratesAlive());
           int dieStart = die;
           for (int i = 0; i < ship.piratesOnShip.size() ; i++) {
               if (ship.piratesOnShip.get(i).alive && die >= 1) {
                   ship.piratesOnShip.get(i).alive = false;
                   die--;
               }
           }
           System.out.println(this.name + " won");
           System.out.println(dieStart + " pirates died on " + ship.name);
           this.win();
           return true;
       } else {
           int die2 = (int) (Math.random()*this.piratesAlive());
           int dieStart2 = die2;
           for (int i = 0; i < this.piratesOnShip.size(); i++) {
               if (this.piratesOnShip.get(i).alive && die2 >= 1) {
                   this.piratesOnShip.get(i).alive = false;
                   die2--;
               }
           }
           System.out.println(ship.name + " won");
           System.out.println(dieStart2 + " pirates died on " + this.name);
           ship.win();

       }
        return false;
    }






}
