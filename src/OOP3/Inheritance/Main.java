package OOP3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4);
        Box box2 = new Box(box);
        System.out.println(box.l + " " + box.h + " " + box.w);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.h+" "+ box3.weight);

        BoxWeight box4 = new BoxWeight(2,4,8, 5);
        System.out.println(box4.l + " " + box4.h + " " + box4.w +" " + box4.weight);
    }
}
