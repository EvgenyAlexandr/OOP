public class Main {
    public static void main(String[] args) {

        /// Исходные данные
        // Автомобили
        Car car          = new Car("car1",4);
        Car car2         = new Car("car1",4);

        // Грузовики
        Truck truck        = new Truck("truck1", 6);
        Truck truck2       = new Truck("truck2",  8);

        // Велосипеды
        Bicycle bicycle      = new Bicycle("bicycle1",2);
        Bicycle bicycle2     = new Bicycle("bicycle2",2);

        // СТО
        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}