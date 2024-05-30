
public class class1st {
    public static void main(String[] args) {
        Student sahdev = new Student(26,"Sahadev",97.86f);
        // sahdev.rno = 26;
        System.out.println(sahdev.name);

    }
}

class Student
    {
        int rno;
        String name;
        float marks;

        // Student(int rollno,String nName,float nMarks)
        // {
        //     rno = rollno;
        //     name = nName;
        //     marks =  nMarks ;
        // }

        Student(int rno,String name,float marks)
        {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }