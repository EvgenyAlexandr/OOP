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

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    // Сравнение студентов
    public static void compareGryffindor(Gryffindor first, Gryffindor second){
        int firstsum  = first.getNobility() + first.getBravery()+ first.getHonor();
        int secondsum = second.getBravery() + second.getHonor() + second.getNobility();
        if (firstsum>secondsum){
            System.out.println(first.getName() + " лучший Гриффиндорец, чем " + second.getName());
        } else if (firstsum == secondsum) {
            System.out.println(first.getName() + " и " + second.getName() + " равны по силе");
        }
        else {
            System.out.println(second.getName() + " лучший Гриффиндорец, чем " + first.getName());
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", Факультет=Грифиндор" +
                ", Благородство=" + nobility +
                ", Честь=" + honor +
                ", Храбрость=" + bravery ;
    }
}
