package OOP1.Constructors;

import java.rmi.StubNotFoundException;

public class Main {
    public static void main(String[] args) {
        Student mayur = new Student();
        System.out.println(mayur.name);
        System.out.println(mayur.roll_no);
        System.out.println(mayur.marks);
        // changing the name
        mayur.changeName("thaware");
        System.out.println(mayur.name);
        // so what is Student() : it is called as constructor
        // what we want during the initialzaition of the object we what to give the values also
        // we want Student(02,"mayur" , 90.0);
        // constructor is the function special function that runs when you create an object and it allocate some variable
        // Student() is called as by default constructor java handle the data type default value
        // but if we want to have customize bind the value / argument to the object

        // parameter
        Student mohit = new Student(01,"mohit",80.4f);
        // it will print the same out put as one of the mayur
        // even after calling the parameter constructor
        // because you have not use this keyword
        System.out.println(mohit.name);
        System.out.println(mohit.roll_no);
        System.out.println(mohit.marks);
        //constructor overloading example
        Student random = new Student(mayur);

        System.out.println(random.name);
        System.out.println(random.roll_no);
        System.out.println(random.marks);

        // calling the costructor from outher constructor
        // using one parameter as we have used no pararmeter already and i dont want to remove it
        // so you can have the exaample;
        Student Ramdom2 = new Student(4);
        System.out.println(Ramdom2.name);
    }
}
class Student {
    int roll_no;
    String name;
    float marks;

    Student(int a){
        this(3,"random2",100.0f);
        // internally it is something like this
        // Student(3,"random2",100.0f);
    }
    Student(){
     // mayur.roll_no = 02;
     // you cannot add obejct name here because this class is just the templete
     // we need a way to add the above value
     //properties object by object
     // we need one word to access every object
     // like when the obejct is created we need the word wich will replace the mayur for mayur.roll_no
     // as we know mayur is not identifed here in this class
    // what is the way to access the reference variable in constructor
        // it is done by this keyword
        this.roll_no = 02;
        this.marks = 90.0f;
        this.name = "Mayur";
        // but now all time new object it will have the same value only because the class is just the templets

    }
    void changeName(String newName){
        name  = newName;
    }
    Student(int roll_no,String name,float marks){
        this.roll_no = roll_no;
        this.marks = marks;
        this.name = name;
        // this create the confusion java dont know argument and class instace variable name are same collabartion

    }
    // you can have multiple constructor because it overload each outher
    // constructor wich takes value from outher object
    Student(Student other){
        this.name = other.name;
        this.roll_no = other.roll_no;
        this.marks = other.marks;
    }
}
