package OOP2.Static;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // static
    static long population;
    public Human(boolean married, int salary, String name, int age) {
        this.married = married;
        this.salary = salary;
        this.name = name;
        this.age = age;
        Human.population += 1;
    }

}
