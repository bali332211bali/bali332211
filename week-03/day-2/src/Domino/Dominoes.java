package Domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {



    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        List<Domino> dominoes2 = new ArrayList<>();
        // You have the list of Domino.Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        Collections.sort(dominoes);
        System.out.println(dominoes);
        System.out.println();

        System.out.println(dominoes);


        dominoes2.add(dominoes.get(0));


        for (int i = 0; i < dominoes.size()-1; i++) {
            dominoes2.add(same(dominoes2, dominoes, i));
        }
        System.out.println(dominoes2);


//        for (int i = 0; i < ) {
//
//            for (int i = 1; i < dominoes.size(); i++) {
//                if (dominoes2.get(k).getRightSide() == dominoes.get(i).getLeftSide()) {
//                    dominoes2.add(dominoes.get(i));
//                }
//            }
//
//        }



    }


    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    private static Domino same(List<Domino> dominoes2, List<Domino> dominoes, int k) {
        Domino l = null;
        for (int i = 1; i < dominoes.size(); i++) {
            if (dominoes2.get(k).getRightSide() == dominoes.get(i).getLeftSide()) {
                l = dominoes.get(i);
            }
        }
        return l;
    }
}
