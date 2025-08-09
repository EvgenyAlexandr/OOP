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
}
