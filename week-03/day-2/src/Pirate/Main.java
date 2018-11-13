package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Pirates> piratesAll = initializePirates();

        System.out.println(piratesAll.get(10).name);



    }




    static List<Pirates> initializePirates() {
        List<Pirates> piratesStart = new ArrayList<>();
        for(int i = 0; i < 30; i++) {
            piratesStart.add(new Pirates(PiratesNames.pirateNames().get(i)));
        }
        return piratesStart;
    }
}
