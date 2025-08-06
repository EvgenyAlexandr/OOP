// Факультет - Пуффендуй — Hufflepuff
public class Hufflepuff extends Hogwarts {

    private int industriousness;    // Трудолюбие
    private int loyalty;            // Верность
    private int honesty;            // Честность

    // Конструктор
    public Hufflepuff(String name, int magicPower, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    // Сравнение студентов
    public static void compareHufflepuff(Hufflepuff first, Hufflepuff second){
        int firstsum  = first.getHonesty() + first.getIndustriousness()+ first.getLoyalty();
        int secondsum = second.getIndustriousness() + second.getLoyalty() + second.getHonesty();

        if (firstsum>secondsum){
            System.out.println(first.getName() + " лучший Пуффендуец, чем " + second.getName());
        } else if (firstsum == secondsum) {
            System.out.println(first.getName() + " и " + second.getName() + " равны по силе");
        }
        else {
            System.out.println(second.getName() + " лучший Пуффендуец, чем " + first.getName());
        }
    }

    // Представление объекта
    @Override
    public String toString() {
        return super.toString() + ", Факультет=Пуффендуй" +
                ", Трудолюбие=" + industriousness +
                ", Верность=" + loyalty +
                ", Честность=" + honesty ;
    }
}
