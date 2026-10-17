package OOP1.Wrapper_Class;

public class Wrapper {
    public static void main(String[] args) {
        Integer x = 45;
        // a is the object of class Integer
        int  a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a  +" " + b);
        // it will not swap because in java there is no concept of pass by reference
        // there is only pass by value so hence it will not swap
        // the swap will only take place in the scope of that function only
        // like if you try to print a , b in that function we will get that value
        // so pass by values in premitive means the a will not be passed to the function
        // only 10  and 20 are passed to the function
        // ok but when you pass the object reference value are passed so the will it swap ?
        Integer c =10;
        Integer d = 20;
        System.out.println(c+ " " + d);
        // it won't swap still now what is the problem
        //If Integer is an object, why doesn't swapping two Integer references work?
        //When you call swap2(c, d), Java passes copies of the references, not the original variables.
        //Only the local reference copies have been swapped. Original c and d in main() remain unchanged. inside the swap2
        //Why does this work?
        //public class Main {
        //    public static void main(String[] args) {
        //        Student s = new Student("Mayur");
        //
        //        changeName(s);
        //
        //        System.out.println(s.name);
        //    }
        //
        //    static void changeName(Student s) {
        //        s.name = "Rahul";
        //    }
        //}
        //Because both references point to the same Student object, and we are modifying that object's field.
        //But Integer is immutable, meaning its stored value cannot be changed after creation.
        //So you cannot modify an existing Integer object from 10 to 20.
        // it happens because of the final keyword
        final int BONUS = 2;
        //BONUS = 3; // this give error
        // since you cannot modify always initialise while declaring it
        // the immutability that you cannot cange value only hold for the premitive types
        //example
        final A mayur = new A("mayur");
        // now even it is final i can do this
        System.out.println(mayur.name);
        mayur.name = "thaware";
        System.out.println(mayur.name);
        //but i cannot do this
        //mayur = new A("new object);
        // when a non premitive is final you cannot reassign it but you can change it ;
        //so
        Integer q = 10;
       // Integer q = 40; // this give error you cannot reassign the same reference variable
        System.out.println(q);
        q = 70; // this is valid
        System.out.println(q);

    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b =  temp;
    }
    static void swap2(Integer c , Integer d){
        Integer temp = c;
        c = d;
        d = temp;
    }
    //Integer class is the final class
    // final is the keyword which prevent the data
    // final prevent the content to be modify
}
class A {

    String name ;
    A(String name){
        this.name = name;
    }

}
