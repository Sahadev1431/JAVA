public class TestRect{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(),r2 = new Rectangle();
        r1.insert(45,10);
        r2.insert(15, 5);
        System.out.println(r1.area());
        System.out.println(r2.area());
    }
}

class Rectangle
{
    double length,width;

    void insert(int l,int w)
    {
        length = l;
        width  = w;

    }
    double area()
    {
        return length * width;      
    }
}