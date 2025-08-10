public class Main {
    public static void main(String[] args) {

        /// Исходные данные
        // Автомобили
        Car car1         = new Car("car1",4);
        Car car2         = new Car("car2",5);

        // Грузовики
        Truck truck1       = new Truck("truck1", 6);
        Truck truck2       = new Truck("truck2",  8);

        // Велосипеды
        Bicycle bicycle1     = new Bicycle("bicycle1",2);
        Bicycle bicycle2     = new Bicycle("bicycle2",3);

        // СТО
        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(car2);

//        station.check(truck1);
//        station.check(truck2);
//
//        station.check(bicycle1);
//        station.check(bicycle2);
    }
}