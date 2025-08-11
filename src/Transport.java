public abstract class Transport implements Vehicle {

    private String modelName; // Номер Модели
    private int wheelsCount;  // Количество колес

    // Конструктор
    public Transport(String modelName, int wheelsCount) {
        this.wheelsCount = wheelsCount;
        this.modelName   = modelName;
    }

    // Геттеры
    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void updateTyre(){
//        for (int i = 0; i < this.getWheelsCount(); i++) {
//            System.out.println("Меняем покрышку");
//        }
        System.out.println("Необходимо заменить покрышек = " + getWheelsCount());
    }


    public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }

}
