public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgression;

    // Конструктор класса
    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    // Сравнение магической силы студентов
    public static void compareAnyStudents(Hogwarts first, Hogwarts second) {
        int firstsum  = first.getMagicPower() + first.getTransgression();
        int secondsum = second.getMagicPower() + second.getTransgression();

        if (firstsum > secondsum) {
            System.out.println(first.getName() + " обладает большей мощностью магии, чем " + second.getName());
        } else if (firstsum == secondsum) {
            System.out.println(first.getName() + " и " + second.getName() + " равны по силе");
        } else {
            System.out.println(second.getName() + " обладает большей мощностью магии, чем " + first.getName());
        }
    }

    // Представление объекта
    @Override
    public String toString() {
        return "Имя = '" + name + "' " +
               ", Сила магии=" + magicPower +
               ", Трансгрессия=" + transgression ;
    }

}
