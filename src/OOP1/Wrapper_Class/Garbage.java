package OOP1.Wrapper_Class;

public class Garbage {
    public static void main(String[] args) {
        // java does auto memory clearing
        // you cannot do manually delete the object memory
        // but you can deside:  what to do when the object is being deleted
        // it is done finilizer methord .
        // right before the memory is going to clear java calls the garbage collector and the finilizer methord
        B obj;
        for (int i = 0; i < 1000000; i++) {
             obj = new B("mayur");
        }
    }
}
class B {
    String name ;
    B(String name){
        this.name = name;
        //System.out.println("object is been created ");
    }

    // when ever the object from the class B is freed this methord is called
    @Override
    protected void finalize() throws Throwable {
        System.out.print("object is destroyed");
    }
}
