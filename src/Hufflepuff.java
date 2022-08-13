public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int witchcraft, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, surname, witchcraft, transgression);
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

    @Override
    public String toString() {
        return name + " " + surname + ", факультет Пуффендуй, сила магии = " + witchcraft + " баллов, расстояние трансгресси = " +
                transgression + " баллов, трудолюбие = " + industriousness + " баллов, верность = " + loyalty + " баллов, честность = " + honesty + " баллов.";
    }
    public static void studentCompare(Hufflepuff student1, Hufflepuff student2) {
        byte a = (byte) (student1.industriousness + student1.loyalty + student1.honesty);
        byte b = (byte) (student2.industriousness + student2.loyalty + student2.honesty);
        if (a > b) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (b > a) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else {
            System.out.println("Суммы баллов учеников " + student1.getName() + " и " + student2.getName() + "  равны");
        }
    }
}
