public class Transport {

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
}
