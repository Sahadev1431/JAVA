public class occurenceLoop
{
    public static void main(String [] args)
    {
        int num = 1235757879;
        int count = 0;
        while(num>0)
        {
            int rem = num%10;
            if(rem== 7)
            {
                count++;
            }
            num = num/10;
        }
        System.out.println("numer 7's occurence is "+count);

}
}