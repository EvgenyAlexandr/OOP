// Факультет - Слизерин — Slytherin
public class Slytherin extends Hogwarts {

    private int cunning;            // Хитрость
    private int determination;      // Решительность
    private int ambition;           // Амбициозность
    private int resourcefulness;    // Находчивость
    private int power;              // Властность

    public Slytherin(String name, int magicPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

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
