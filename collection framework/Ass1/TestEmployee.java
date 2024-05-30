import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Collections;
public class TestEmployee {

    public static void main(String[] args) {
        LinkedList <Employee> ls = new LinkedList<Employee>();
        Employee e1 = new Employee(100, "Sahadev", LocalDate.of(2002, 6, 14), 1300000);
        Employee e2 = new Employee(101, "Chirag", LocalDate.of(2001, 7, 31), 70000);
        Employee e3 = new Employee(102, "gautam", LocalDate.of(2002, 8, 10), 80000);
        Employee e4 = new Employee(103, "Mann", LocalDate.of(2002, 6, 15), 20000);
        Employee e5 = new Employee(104, "jatin", LocalDate.of(2002, 6, 14), 90000);
        ls.add(e1);
        ls.add(e2);
        ls.add(e3);
        ls.add(e4);
        ls.add(e5);


        for (Employee el : ls)
        {
            el.getDetails();
        }

        Collections.sort(ls);
        System.out.println("AFTER SORTING");
        for (Employee el : ls)
        {
            el.getDetails();
        }
    }
}

class Employee implements Comparable<Employee>{
    private int Empid;
    private String name;
    private LocalDate dob;
    private double salary;

    Employee(int Empid,String name,LocalDate dob,double salary)
    {
        this.Empid = Empid;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    public void getDetails()
    {
        System.out.println("Emp id  : "+Empid);
        System.out.println("Name  : "+name);
        System.out.println("DOB  : "+dob);
        System.out.println("Salaray  : "+salary);
        System.out.println("----------------");
    }
    public int compareTo(Employee obj)
    {
        if (this.salary == obj.salary)
        {
            return 0;
        }
        else if (this.salary > obj.salary)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}