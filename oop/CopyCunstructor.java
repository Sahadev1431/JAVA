//  THERE ARE NO COPY CONSTRUCTOR IN JAVA NUT WE CAN ACHIEVE THAT
public class CopyCunstructor {
    public static void main(String[] args) {
        Employee sahadev = new Employee(101,"Sahdev");
        Employee jiya = new Employee(sahadev);
        jiya.display();
        
    }
}

class Employee
{
    int empId;
    String name;

    Employee(int i,String n)
    {
        empId = i;
        name = n;
    }

    Employee(Employee obj)
    {
        empId = obj.empId;
        name = obj.name;
    }

    void display()
    {
        System.out.println("Employee id :" + empId);
        System.out.println("Employee name :" + name);
    }
}
