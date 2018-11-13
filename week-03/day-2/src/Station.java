public class Station {


    int gasAmount = 5000000;

    public void refill(Car car) {
        gasAmount -=  car.capacity - car.gasAmount;
        car.gasAmount += car.capacity - car.gasAmount;
    }





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




    }
}
