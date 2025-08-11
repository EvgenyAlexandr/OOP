// Грузовик
public class Truck extends Transport{
//public class Truck extends Transport {
    // Конструктор
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}