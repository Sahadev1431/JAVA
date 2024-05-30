// package FunctionalInterface;
@FunctionalInterface
interface Cab
{
    public void bookCab();
};

// class uber implements cab{
//     @Override
//     public void bookCab()
//     {
//         System.out.println("uber has booked");
//     }
// }

public class fInterface {
    public static void main(String[] args) {
        Cab c1 = ()->System.out.println("Uber cab has booked successfully ok");
        c1.bookCab();
    }
}
