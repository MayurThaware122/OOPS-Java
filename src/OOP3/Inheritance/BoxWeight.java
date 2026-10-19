package OOP3.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this it says call the parent class constructor like go to the construction
        // public Box(double l, double h, double w) {
        //        this.l = l;
        //        this.h = h;
        //        this.w = w;
        //    }
        // this one you can check by ctrl + click on super
        // so this is used to  initialise the values present in parent class
        this.weight = weight;
    }
}
