// Грузовик
public class Truck extends Car{

    // Конструктор
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }

    private void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }
}