// Грузовик
public class Truck {

    public String modelName; // Номер Модели
    public int wheelsCount;  // Количество колес

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}