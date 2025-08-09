//   Велосипед
public class Bicycle extends Transport {

    // Конструктор
    public Bicycle (String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    @Override
    public void service(){
        updateTyre();
    }

    private void updateTyre(){
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
