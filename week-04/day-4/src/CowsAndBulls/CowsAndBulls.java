package CowsAndBulls;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CowsAndBulls {

  int number;

  CowsAndBulls(int number) {
    this.number = number;
  }

  List<Integer> split(int number) {
    List<Integer> numbers = new ArrayList<>();

    while(number > 0) {
      numbers.add(number % 10);
      number = number / 10;
    }
    return numbers;
  }

  void scanner(List<Integer> numbers) {

    String string = "";

    for (int i = 0; i < numbers.size(); i++) {
      System.out.println("number");
      Scanner scanner = new Scanner(System.in);
      int user = scanner.nextInt();

      if (user == numbers.get(numbers.size()-1-i)) {
        string += "cow";
      } else {
        string += "bull";
      }
    }
    System.out.println(string);
  }










//  Create a class what is capable of playing exactly one game of Cows and Bulls (CAB).
//  The player have to guess a 4 digit number. For every digit that the player guessed correctly
//  in the correct place, they have a “cow”. For every digit the player guessed correctly
//  in the wrong place is a “bull.”
//
//  The CAB object should have a random 4 digit number, which is the goal to guess.
//  The CAB object should have a state where the game state is stored (playing, finished).
//  The CAB object should have a counter where it counts the guesses.
//  The CAB object should have a guess method, which returns a string of the guess result
//  All methods, including constructor should be tested
}
