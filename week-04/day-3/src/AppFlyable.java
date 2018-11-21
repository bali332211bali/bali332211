import Zoo.Animal;
import Flyable.*;

public class AppFlyable {

  public static void main(String[] args) {

    Animal bird2 = new Bird("bird2");
    Vehicle helicopter = new Helicopter();

    ((Bird) bird2).land();
    ((Bird) bird2).fly();
    ((Bird) bird2).takeOff();
    System.out.println();
    ((Helicopter) helicopter).fly();
    ((Helicopter) helicopter).takeOff();
    ((Helicopter) helicopter).land();





  }

}
