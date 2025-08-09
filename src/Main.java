public class Main {
    public static void main(String[] args) {

        /// Исходные данные
        // Автомобили
        Car car          = new Car("car1",4);
        Car car2         = new Car("car1",4);
//        car.modelName    = ;
//        car2.modelName   = "car2";
//        car.wheelsCount  = ;
//        car2.wheelsCount = 4;

        // Грузовики
        Truck truck        = new Truck();
        Truck truck2       = new Truck();
        truck.modelName    = "truck1";
        truck2.modelName   = "truck2";
        truck.wheelsCount  = 6;
        truck2.wheelsCount = 8;

        // Велосипеды
        Bicycle bicycle      = new Bicycle();
        Bicycle bicycle2     = new Bicycle();
        bicycle.modelName    = "bicycle1";
        bicycle2.modelName   = "bicycle2";
        bicycle.wheelsCount  = 2;
        bicycle2.wheelsCount = 2;

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}