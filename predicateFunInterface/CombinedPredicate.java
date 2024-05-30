import java.util.function.Predicate;
public class CombinedPredicate {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};
        Predicate<Integer>p1 = i->(i % 2 == 0);
        Predicate<Integer>p2 = i->(i>50);

        // for (int ele:arr)
        // {
        //     // if(p1.test(ele) && p2.test(ele)) // we can write like this bot not the proper way
        //     if(p1.and(p2).test(ele))
        //     // and will check both are true or not
        //     //or will check either one is true
        //     //negate will reverse the boolean aka if true then it will make false and if false then it will make true
        //     {
        //         System.out.println(ele);
        //     }   
        // }

        for (int ele:arr)
        {
            // if(p1.test(ele) && p2.test(ele)) // we can write like this bot not the proper way
            if(p1.negate().test(ele))
            // and will check both are true or not
            //or will check either one is true
            //negate will reverse the boolean aka if true then it will make false and if false then it will make true
            {
                System.out.println(ele);
            }   
        }
    }
}
