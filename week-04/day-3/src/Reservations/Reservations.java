package Reservations;

public class Reservations implements Reservationy {

  public String reservation() {
    String reservation = "";
    for (int i = 0; i < 8; i++) {
      reservation += (char) (65+(int) (Math.random()*26));
    }
    return reservation;
  }

  @Override
  public String getCodeBooking() {
    return "Booking# " + reservation();
  }

  String reset = "\u001B[0m";
  String red = "\u001B[31m";

  @Override
  public String getDowBooking() {
    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return red + " for " + reset + days[(int) (Math.random()*7)];
  }

}
