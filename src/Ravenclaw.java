// Факультет - Когтевран — Ravenclaw
public class Ravenclaw extends Hogwarts  {

    private int mind;       // Ум
    private int wisdom;     // Мудрость
    private int wit;        // Остроумие
    private int creativity; // Креативность

    // Конструктор
    public Ravenclaw(String name, int magicPower, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    // Сравнение студентов
    public static void compareRavenclaw(Ravenclaw first, Ravenclaw second){
        int firstsum  = first.getMind()   + first.getWisdom() + first.getWit() + first.getCreativity();
        int secondsum = second.getWisdom() + second.getWit()  + first.getCreativity() + second.getMind();

        if (firstsum>secondsum){
            System.out.println(first.getName() + " лучший Когтевранец, чем " + second.getName());
        } else if (firstsum == secondsum) {
            System.out.println(first.getName() + " и " + second.getName() + " равны по силе");
        }
        else {
            System.out.println(second.getName() + " лучший Когтевранец, чем " + first.getName());
        }
    }

    // Представление объекта
    @Override
    public String toString() {
        return super.toString() + ", Факультет=Когтевран" +
                ", Ум=" + mind +
                ", Мудрость=" + wisdom +
                ", Остроумие=" + wit +
                ", Креативность=" + creativity ;
    }
}
