package sahadev;

public class oop1 {
    static class xyz{
        static String name;

        xyz(String name){
            xyz.name = name;
        }
    }
    public static void main(String[] args) {
    //    xyz x = new xyz("Sahadev");
    //    xyz c = new xyz("Chirag");

       System.out.println(xyz.name);    //should be like x.name since it is static
       System.out.println(xyz.name);
}

}



