public abstract class Hogwarts {
    protected String name;
    protected String surname;
    protected int witchcraft;
    protected int transgression;

    public Hogwarts(String name, String surname, int witchcraft, int transgression) {
        this.name = name;
        this.surname = surname;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public static void studentDescription(Hogwarts student) {
        System.out.println(student.toString());
    }

    public static void anyFacultyStudentCompare(Hogwarts student1, Hogwarts student2) {
        byte a = (byte) (student1.witchcraft + student1.transgression);
        byte b = (byte) (student2.witchcraft + student2.transgression);
        if (a > b) {
            System.out.println(student1.getName() + " " + student1.getSurname() + " обладает бОльшей мощностью магии, чем " + student2.getName() + " " + student2.getSurname());
        } else if (b > a) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " обладает бОльшей мощностью магии, чем " + student1.getName() + " " + student1.getSurname());
        } else {
            System.out.println("Суммы баллов учеников " + student1.getName() + " " + student1.getSurname() + " и " + student2.getName() + " " + student2.getSurname() + " равны");
        }
    }
}

