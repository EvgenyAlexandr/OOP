// Факультет - Когтевран — Ravenclaw
public class Ravenclaw extends Hogwarts  {

    private int mind;       // Ум
    private int wisdom;     // Мудрость
    private int wit;        // Остроумие
    private int creativity; // Креативность

    public Ravenclaw(String name, int magicPower, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Факультет=Когтевран" +
                ", Ум=" + mind +
                ", Мудрость=" + wisdom +
                ", Остроумие=" + wit +
                ", Креативность=" + creativity ;
    }
}
