package OOP2.Packages;


import static OOP2.Packages.a.message.mess;

public class Main {
    public static void main(String [] args){
        A random = new A("mayur");
        // so when ever i try to print the object of A i want to get print the name mayur
        System.out.print(random);
        // but it print some random value A @ some hash value and before that there is path of package
        // so why does this happen so print call the value of(obj) internally you can check by ctrl click
        // which the call internally valueof(obj) and ctrl click on the value of you will see it does toString()
        //on the object and when it is null like there is no method tostring() to the obejct class or object data type
        // the toString() internally do this
        //public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }
        // so you can change the output print message when you print the object
        // it is called as toString() method overriding

        // packages are the container which hold the class names
        // in simple word package is just the folder
        // if there is only one folder inside the other folder it will show like that com.mayur means com folder have one more
        // folder inside name mayur but if one more folder is there then it will not show like in the top of code
        // use case of packages
        // we cannot have like same file name in same folder hence we use package to have the different folder but same name of java file.
        // package a and b have same name java file which is valid  now no error there occur of duplicate name
        // so  package provides us the compartment for our files
        mess();
        //this line on top import static OOP2.Packages.a.message.mess;
        // help you to use the function of other folders into your file
        //without rewriting the code
        //The package statement does not create the folder. It declares the class's package identity.
        // The folder structure normally matches that package name.
        //Remember:
        //- package → Where my class belongs.
        //- import → Which class or member I want to use from another package.
        //- import static → Allows me to use static members directly without writing the class name.
        //- public → Allows access from other packages.
        //One more thing: If two classes belong to the same package, you don't need to import each other.
        //For example, if both a.java and b.java declare package OOP2.Packages;, class b can directly call a.message()
        // without importing a.
        //Different physical folders do not automatically mean different Java packages.
        // Java determines the package from the package declaration, not just the folder.
        //If two classes are in different packages,
        // you normally declare the package at the top of both files and import the required class or static method.
        // so how is java knowing to run the code of different package file into this file
        // it is happening because of this like on the top import static OOP2.Packages.a.message.mess;
        // it is only done when that method is public then only you can make that call from different package
        // so now you get why we do import java.util.Arrays or like java.util.* it help java run time to
        // know that the method of Array class are been use like Arrays.sort hence pre written code
        // is there that run on the input array
    }
}
class A{
    String name;
    A(String name){
        this.name = name;
    }
}
