package Station;

public class Main {
    public static void main(String[] args) {

        Station station = new Station();
        Car car = new Car();

        car.gasAmount += 40;
        System.out.println(car.gasAmount);

        station.refill(car);

        System.out.println(car.gasAmount);
        System.out.println(station.gasAmount);
    }
}
