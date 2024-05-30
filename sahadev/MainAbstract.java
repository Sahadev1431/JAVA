package sahadev;

public class MainAbstract {

    
    public static void main(String[] args) {
        SonAbstract s1 = new SonAbstract();
        s1.career();
        s1.partner();

        DaughterAbstract d1 = new DaughterAbstract();
        d1.career();
        d1.partner();
    }
    
}
