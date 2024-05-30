public class ThrowExcep {
    public static void main(String[] args) {
        int age = 15;
        try
        {
            if( age < 18 )
            {
                throw new youngerAgeException("You can't vote");
            }

            else
            {
                System.out.println("Yes You can vote");
            }
        }
        catch(youngerAgeException e)
        {
            e.printStackTrace();
        }
        System.out.println("oh your age is "+age);
        
    }
}
