public abstract class Transport {

    private int wheelsCount;  // Количество колес
    private String modelName; // Номер Модели

    public Transport(String modelName, int wheelsCount) {
        this.wheelsCount = wheelsCount;
        this.modelName = modelName;
    }

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

    public abstract void service();
}
