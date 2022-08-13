public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int witchcraft, int transgression, int mind, int wit, int creativity) {
        super(name, surname, witchcraft, transgression);
        this.mind = mind;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() { return mind; }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", факультет Когтевран, сила магии = " + witchcraft +
                " баллов, расстояние трансгрессии = " + transgression + " баллов, ум = " + mind +
                " баллов, мудрость = " + wit + " баллов, творчество = " + creativity + " баллов.";
    }
    public static void studentCompare(Ravenclaw student1, Ravenclaw student2) {
        byte a = (byte) (student1.mind + student1.wit + student1.creativity);
        byte b = (byte) (student2.mind + student2.wit + student2.creativity);
        if (a > b) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (b > a) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else {
            System.out.println("Суммы баллов учеников " + student1.getName() + " и " + student2.getName() + "  равны");
        }
    }
}
