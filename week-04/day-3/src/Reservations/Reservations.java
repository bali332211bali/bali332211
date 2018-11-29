package Reservations;

public class Reservations implements ReservationInterface {

  public String reservationCode() {
    String reservation = "";
      for (int i = 0; i < 8; i++) {
        if ((int) (Math.random() * 36) > 9) {
          reservation += (char) (65 + (int) (Math.random() * 26));
        } else {
          reservation += (char) (48 + (int) (Math.random() * 10));
        }
      }
    return reservation;
  }

  @Override
  public String getCodeBooking() {
    return "Booking# " + reservationCode();
  }

  String reset = "\u001B[0m";
  String red = "\u001B[31m";

  @Override
  public String getDowBooking() {
    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return red + " for " + reset + days[(int) (Math.random()*7)];
  }

}





