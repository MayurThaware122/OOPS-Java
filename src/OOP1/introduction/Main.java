package OOP1.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // can you make a data structure to store the data of 5 student roll number
        // you can use this
        int[] roll_no = new int[5];
        //can you make the data structure to store the name data of 5 student
        // we can use the string
        String[] name = new String[5];
        //but if you want to store the data of 5 Student  ??
        // the which data type to use
        // you can do like this roll number name and marks array for each thing but
        // we want the type of data structure which content all this thing in one single line
        // this is where classes and object oriented programming comes in use
        // Defination:: -- A class is the named group of properties and function :  i can combine all three
        // entity like name roll number and marks into single entity i can do it via classes
        // Student [] st = new Student[5] ; own data type we can make with the help of class wich will have all three
        //attribute in it like the name rollno marks etc

        Student mayur;
        //mayur content of three property name rollno marks
        // A class is like a templete / a logical construct of an object . you can also add the function in it like add the function which
        //calculate the gp grade pointer
        // what is now object :: it is an instance of the class like mayur is the object is the class Student
        // class helps us defineing the data type
        // object are the one which occupies the space in the memory
        //objects are store into heap memory and the variable are store into stack memory
        // the dot operator (.) link the obejct reference variable with instance variable
        //variable inside the object are instance variable or like also called as class variable

        // only declaring the object reference variable
        Student student1;
        Student[] stu = new Student[5];
        // lets try to print it
        System.out.println(Arrays.toString(stu));
        // all null output

        mayur = new Student();
        mayur.roll_no = 02;
        mayur.name = "mayur Thaware";

        System.out.println(mayur);
        System.out.println(mayur.name);
        System.out.println(mayur.marks);
        System.out.println(mayur.roll_no);
    }
}
    // this is how we create our own data type with class
class Student {
    int roll_no ;
    String name ;
    float  marks = 90; // default value for each student
    // so how we create the object we use new keyword

}

