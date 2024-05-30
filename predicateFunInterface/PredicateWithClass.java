import java.util.function.Predicate;;

class Employee
{
    String name;
    double salary;
    int experience;

    Employee (String name,double salary,int experience)
    {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
}

public class PredicateWithClass {
    public static void main(String[] args) {
        Employee em1 = new Employee("sahadev", 1300000, 5);
        Employee em2 = new Employee("Jatin", 500000, 2);
        Employee em3 = new Employee("Chirag", 700000, 4);
        Employee em4 = new Employee("Gautam", 400000, 1);

        Employee[]arr = {em1,em2,em3,em4};
        Predicate <Employee> e = (obj)->(obj.salary >= 500000 && obj.experience > 2);
        
        for(Employee ele : arr)
        {
            if(e.test(ele))
            {
                System.out.println(ele.name.toUpperCase() +" "+ ele.salary);
            }
        }
    }
}
