package OOP1.Wrapper_Class;

public class Main {
    public static void main(String [] args){
        // in java premitive we do not use the new keyword
        Student one = new Student(02,"mayur",90.0f);
        System.out.println(one.name);
        Student two = one;
        two.name = "good";
        System.out.println(one.name);
    }
}
class Student {
    int roll_no ;
    String name;
    float marks;
    Student(int roll_no,String name, float marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }
}
