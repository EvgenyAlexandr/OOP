// Автомобиль
public class Car extends Transport{

    // Конструктор
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }
}
