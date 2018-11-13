package Pirate;

public class Pirates {

    String name;
    int intoxicated;
    boolean sleeping = false;
    boolean alive = true;

    Pirates() {

    }

    void drinkSomeRum() {
        if (alive) {
            this.intoxicated++;
        } else {
            System.out.println(this.name + " dead");
        }

    }

    void howsItGoingMate() {
        if(this.intoxicated < 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
        this.sleeping = true;
    }

    void die() {
        alive = false;
    }


}
