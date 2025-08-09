// Автомобиль
public class Car extends Bicycle{

    // Конструктор
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }

    private void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
}