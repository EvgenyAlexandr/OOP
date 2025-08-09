// Автомобиль
//public class Car extends Bicycle{
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

    private void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
}