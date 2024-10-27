package projects.f5.person_java;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Nadiia", "Alaieva", "FD12334", 1989, "Ukraine", 'F');
        Person person2 = new Person("Jonny", "Depp", "YR123565", 1963, "USA", 'M');
        person1.printDetails();
        System.out.println();
        person2.printDetails();

    }

}
