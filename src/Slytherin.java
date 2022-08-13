public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustOfPower;

    public Slytherin(String name, String surname, int witchcraft, int transgression, int trick, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(name, surname, witchcraft, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", факультет Слизерин, сила магии = " + witchcraft +
                " баллов, расстояние трансгрессии = " + transgression + " баллов, хитрость = " + trick +
                " баллов, решительность = " + determination + " баллов, амбициозность = " + ambition + " баллов, находчивость = " +
                resourcefulness + " баллов, жажда власти = " + lustOfPower + " баллов.";
    }
    public static void studentCompare(Slytherin student1, Slytherin student2) {
        byte a = (byte) (student1.trick + student1.determination + student1.ambition + student1.resourcefulness + student1.lustOfPower);
        byte b = (byte) (student2.trick + student2.determination + student2.ambition + student2.resourcefulness + student2.lustOfPower);
        if (a > b) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (b > a) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        } else {
            System.out.println("Суммы баллов учеников " + student1.getName() + " и " + student2.getName() + "  равны");
        }
    }
}
