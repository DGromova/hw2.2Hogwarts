public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, witchcraft, transgression);
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

    @Override
    public String toString() {
        return name + " " + surname + ", факультет Гриффиндор, сила магии = " + witchcraft +
                " баллов, расстояние трансгрессии = " + transgression + " баллов, благородство = " +
                nobility + " баллов, честь = " + honor + " баллов, храбрость = " + bravery + " баллов.";
    }
    public static void studentCompare(Gryffindor student1, Gryffindor student2) {
        byte a = (byte) (student1.nobility + student1.honor + student1.bravery);
        byte b = (byte) (student2.nobility + student2.honor + student2.bravery);
        if (a > b) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (b > a) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else {
            System.out.println("Суммы баллов учеников " + student1.getName() + " и " + student2.getName() + "  равны");
        }
    }
}
