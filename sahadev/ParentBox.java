package sahadev;

public class ParentBox {
    double l;
    double w;
    double h;

    ParentBox()
    {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    ParentBox(double side)
    {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    ParentBox(double l,double w,double h)
    {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    static void area()
    {
        System.out.println("Hey I am in Parent class");
    }
    ParentBox (ParentBox old_obj)
    {
        this.l = old_obj.l;
        this.w = old_obj.w;
        this.h = old_obj.h;
    }
}
