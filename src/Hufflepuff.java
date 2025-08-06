// Факультет - Пуффендуй — Hufflepuff
public class Hufflepuff extends Hogwarts {

    private int industriousness;    // Трудолюбие
    private int loyalty;            // Верность
    private int honesty;            // Честность

    public Hufflepuff(String name, int magicPower, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", Факультет=Пуффендуй" +
                ", Трудолюбие=" + industriousness +
                ", Верность=" + loyalty +
                ", Честность=" + honesty ;
    }
}
