public class Main {
    public static void main(String[] args) {
        homework();
    }
    public static void homework() {
        //Ученики Гриффиндора
        Gryffindor harryPotter = new Gryffindor("Гарри", "Поттер", 50, 50, 60, 90, 80);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 70, 60, 50, 50, 60);
        Gryffindor ronWeasley = new Gryffindor("Рон", "Уизли", 40, 50, 30, 60, 50);
        //Ученики Слизерина
        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 50, 40, 90, 40, 60, 50, 90);
        Slytherin grahamMontague = new Slytherin("Грэхем", "Монтегю", 50, 80, 50, 70, 40, 60, 40);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 30, 20, 30, 30, 20, 30, 30);
        //Ученики Пуффендуя
        Hufflepuff zachariasSmith = new Hufflepuff("Захария", "Смит", 40, 20, 30, 20, 20);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", 50, 40, 70, 80, 80);
        Hufflepuff jastinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 40, 30, 30, 40, 40);
        //Ученики Когтеврана
        Ravenclaw choChang = new Ravenclaw("Чжоу", "Чанг", 30, 30, 40, 30, 30);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 60, 30, 60, 70, 40);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", 30, 20, 40, 40, 50);
        //Задание 1. Вывести на экран описание студента
        System.out.println("Описание студентов:");
        Hogwarts.studentDescription(harryPotter);
        Hogwarts.studentDescription(cedricDiggory);
        Hogwarts.studentDescription(choChang);
        Hogwarts.studentDescription(dracoMalfoy);
        //Задание 2. Создать методы для сравнения студентов одного факультета
        System.out.println();
        System.out.println("Сравнение студентов одного факультета:");
        Gryffindor.studentCompare(hermioneGranger, ronWeasley);
        Hufflepuff.studentCompare(zachariasSmith, jastinFinchFletchley);
        Ravenclaw.studentCompare(padmaPatil, choChang);
        Slytherin.studentCompare(grahamMontague, dracoMalfoy);
        //Задание 3. Сравнение учеников любых факультетов
        System.out.println();
        System.out.println("Сравнение учеников любых факультетов:");
        Hogwarts.anyFacultyStudentCompare(marcusBelby, gregoryGoyle);
        Hogwarts.anyFacultyStudentCompare(harryPotter, cedricDiggory);
    }
}