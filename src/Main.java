public class Main {
    public static void main(String[] args) {
        /* Название факультетов
            Гриффиндор — Gryffindor
            Пуффендуй  — Hufflepuff
            Когтевран  — Ravenclaw
            Слизерин   — Slytherin
         */

        Gryffindor garry    = new Gryffindor("Гарри Поттер",        70, 65, 85, 90, 100);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер",  60, 70, 90, 70, 90);
        Gryffindor ron      = new Gryffindor("Роналд Уизли",        50, 40, 95, 85, 70);

        Hufflepuff zaharia  = new Hufflepuff("Захария Смит",         85, 70, 65, 60, 70);
        Hufflepuff sedrik   = new Hufflepuff("Седрик Диггори",       80, 85, 85, 85, 80);
        Hufflepuff jastin   = new Hufflepuff("Джастин Финч-Флетчли", 75, 75, 80, 70, 85);

        Ravenclaw choy      = new Ravenclaw("Чжоу Чанг",    70, 75, 65, 75, 70, 90);
        Ravenclaw padma     = new Ravenclaw("Падма Патил",  65, 80, 90, 45, 45, 85);
        Ravenclaw marcus    = new Ravenclaw("Маркус Белби", 60, 70, 70, 80, 60, 75);

        Slytherin drako     = new Slytherin("Драко Малфой",   90, 90, 70, 85, 85, 85, 85);
        Slytherin graham    = new Slytherin("Грэхэм Монтегю", 85, 70, 85, 95, 50, 80, 70);
        Slytherin gregory   = new Slytherin("Грегори Гойл",   80, 75, 85, 95, 75, 80, 90);

        System.out.println(garry);
        System.out.println(zaharia);
        System.out.println(choy);
        System.out.println(drako);


    }
}