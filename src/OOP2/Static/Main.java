package OOP2.Static;

public class Main {
    public static void main(String[] args) {
        // if the files are in same folder / package you don't need to put the import statement
        Human mayur = new Human(false,45000,"mayur",21);
        Human rahul = new Human(true,30000,"rahul" , 28);
        System.out.println(mayur.name);
        // now but the object have different values
        // but what if there are some property for the all object of human class
        // that are same for everyone , example population it is same for rahul and mayur
        // such property wich are not related to the object and are object independent that are know as static properties
        // so if there is static filed then it should be access through class name but non static field are not access
        // with the class name like Human.population is wrong if the population is not declared as static in class variable
        System.out.println(mayur.population);
        System.out.println(rahul.population);
        // so static variable means that : when a member is declared static it can be access before any of the object of the class
        // is been created and without referencing to that object like without using the object also you can access to static variable
        // like this
        System.out.println(Human.population);
        // you can declared both the methord and variable as the static
        // most famous methord wich is static is psvm
        // why it is static ?

        // static block run only once the first object of class is created it is not like
        // ever time object is created it will run
        Main obj= new Main();
        System.out.println(a + " " + b);
        b += 3;
        Main obj2 = new Main();
        // how here again obj2 is created but still the message inside static block is not called
        // also value of b is not changed

        System.out.println(Main.a + " " + Main.b);
    }
    static  int a = 4;
    static int b ;
    static {
        System.out.println("static block is been called ");
        b = a * 5;
    }
}
