public class SleepMethid extends Thread {

    public void run() 
    {
        try
        {for (int i = 0; i <= 5; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }}
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)  {
        // try
        // {
        //     for (int i = 0; i <= 5; i++)
        //     {
        //         Thread.sleep(1000);
        //         System.out.println(i);
        //     }
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }

        // for (int i = 0; i <= 5; i++)
        //     {
        //         Thread.sleep(1000);
        //         System.out.println(i);
        //     }   // cant use it directly bcz it throws exception so use try catch or else main method throws Exception 

        SleepMethid s1 = new SleepMethid();
        s1.start();
    }
}
