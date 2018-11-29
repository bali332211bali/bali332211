import java.util.Scanner;

public class Diamond {



  static void addString(String string, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(string);
    }
  }


  public static void main(String[] args) {


    System.out.println("Give me a number");
    Scanner scanner = new Scanner(System.in);
    int user = scanner.nextInt();


    for (int i = 0; i < user/2; i++) {
      addString(" ", user/2-i);
      addString("*", 1+i*2);
      System.out.println();
    }

    addString("*", user);
    System.out.println();

    for (int i = 0; i < user/2; i++) {
      addString(" ", 1+i);
      addString("*", user-2-i*2);
      System.out.println();
    }

  }
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
}
