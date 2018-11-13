public class Car {

    int gasAmount = 0;
    int capacity = 100;


//    Create Station and Car classes
//            Station
//    gasAmount
//    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//    Car
//            gasAmount
//    capacity
//    create constructor for Car where:
//    initialize gasAmount -> 0
//    initialize capacity -> 100
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
