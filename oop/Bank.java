public class Bank {
    public static void main(String[] args) {
        testBank rahul = new testBank(),manish = new testBank();
        rahul.insert("Rahul");
        manish.insert("Manish");
        // rahul.details();
        rahul.checkBal();
        rahul.diposit(10000);
        rahul.checkBal();
        rahul.diposit(5000);
        rahul.checkBal();

        rahul.details();
        rahul.withdraw(2000);
        rahul.checkBal();
        rahul.details();
        rahul.withdraw(15000);
        rahul.checkBal();
    }
}

class testBank
{
    double amount;
    String name;

    void insert(String n)
    {
        name = n;
    }

    void diposit(double dipAmt)
    {
        amount +=dipAmt;
        System.out.println(dipAmt+" diposited to your account");
    }
    
    void withdraw(double withAmt)
    {
        if(withAmt > amount)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            amount -= withAmt;
            System.out.println(withAmt+" withrawed successfully");
        }
    }
    void checkBal()
    {
        System.out.println("Your current balance is :"+amount);
    }
    void details()
    {
        System.out.println("Name            :"+name);
        System.out.println("Current Balance :"+amount);
    }
}