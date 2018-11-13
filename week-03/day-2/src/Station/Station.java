package Station;

public class Station {


    int gasAmount = 5000000;

    public void refill(Car car2) {
        gasAmount -=  car2.capacity - car2.gasAmount;
        car2.gasAmount += car2.capacity - car2.gasAmount;
    }





//    Create Station.Station and Station.Car classes
//            Station.Station
//    gasAmount
//    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//    Station.Car
//            gasAmount
//    capacity
//    create constructor for Station.Car where:
//    initialize gasAmount -> 0
//    initialize capacity -> 100

}
