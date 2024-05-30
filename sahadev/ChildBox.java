package sahadev;

public class ChildBox extends ParentBox {
    double weight;

    ChildBox()
    {
        this.weight =  -1;
    }

    ChildBox(double l,double w,double h,double weight)
    {
        super(l,w,h);       // call the base class constructor
        this.weight = weight;
    }
    //  void area()
    // {
    //     System.out.println("Hey I am in Child class");
    // }
}
