// Факультет - Гриффиндор — Gryffindor.
public class Gryffindor extends Hogwarts {

    private int nobility;   // Благородство
    private int honor;      // Честь
    private int bravery;    // Храбрость

    // Конструктор
    public Gryffindor(String name, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + ", Факультет=Грифиндор" +
                ", Благородство=" + nobility +
                ", Честь=" + honor +
                ", Храбрость=" + bravery ;
    }
}
