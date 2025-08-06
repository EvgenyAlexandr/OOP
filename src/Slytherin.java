// Факультет - Слизерин — Slytherin
public class Slytherin extends Hogwarts {

    private int cunning;            // Хитрость
    private int determination;      // Решительность
    private int ambition;           // Амбициозность
    private int resourcefulness;    // Находчивость
    private int power;              // Властность

    // Конструктор
    public Slytherin(String name, int magicPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    // Сравнение студентов
    public static void compareSlytherin(Slytherin first, Slytherin second){
        int firstsum  = first.getCunning() + first.getDetermination()+ first.getAmbition() + first.getResourcefulness() + first.getPower();
        int secondsum = second.getDetermination() + second.getAmbition() + first.getResourcefulness() + second.getCunning() + second.getPower();

        if (firstsum>secondsum){
            System.out.println(first.getName() + " лучший Слизеринец, чем " + second.getName());
        } else if (firstsum == secondsum) {
            System.out.println(first.getName() + " и " + second.getName() + " равны по силе");
        }
        else {
            System.out.println(second.getName() + " лучший Слизеринец, чем " + first.getName());
        }
    }

    // Представление объекта
    @Override
    public String toString() {
        return super.toString() + ", Факультет=Когтевран" +
                ", Хитрость=" + cunning +
                ", Решительность=" + determination +
                ", Амбициозность=" + ambition +
                ", Находчивость=" + resourcefulness +
                ", Властность=" + power;
    }
}
