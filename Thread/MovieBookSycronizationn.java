public class MovieBookSycronizationn extends BookTheaterSeat implements Runnable {

    static BookTheaterSeat b1 = new BookTheaterSeat();
    int noOfSeat;
    public void run ()
    {
        b1.bookSeat(noOfSeat);
    }
    public static void main(String[] args) {
        MovieBookSycronizationn m1 = new MovieBookSycronizationn();
        m1.noOfSeat = 7;
        Thread Sahadev = new Thread(m1);
        Sahadev.start();

        MovieBookSycronizationn m2 = new MovieBookSycronizationn();
        m2.noOfSeat = 4;
        Thread Gopu = new Thread(m2);
        Gopu.start();
    }
}

class BookTheaterSeat 
{
    static int totalSeats = 10;
    synchronized public void bookSeat(int seat)
    {
        if (seat <= totalSeats )
        {
            System.out.println("Hurray "+seat+" Seats have booked successfully");
            totalSeats = totalSeats - seat;
            System.out.println("seats left "+totalSeats);
        }
        else
        {
            System.out.println("Sorry cant book " +seat+ " seats");
        }
    }
}