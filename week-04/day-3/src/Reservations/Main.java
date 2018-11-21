package Reservations;

public class Main {

      public static void main(String[] args) {

        Reservations reservations = new Reservations();

        for (int i = 0; i < 7; i++) {
          System.out.print(reservations.getCodeBooking());
          System.out.print(reservations.getDowBooking());
          System.out.println();
        }

  }

//  @Override
//  public int compareTo(String o) {
//    Reservations reservations = new Reservations();
//    List<String> bookings = new ArrayList<>();
//
//    for (int i = 0; i < 7; i++) {
//      String temp = "";
//      temp += reservations.getCodeBooking();
//      temp += reservations.getDowBooking();
//      bookings.add(temp);
//    }
//
//    if (bookings)
//
//
//    return 0;
//  }
}
