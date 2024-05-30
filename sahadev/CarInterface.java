package sahadev;

public class CarInterface implements EngineInterface,BrakeInterface,MediaInterface {
    public void start()
    {
        System.out.println("car starts");
    }   
    public void stop()
    {
        System.out.println("Car stops");
    }
    public void brake()

    {
    System.out.println("Car brakes");
    }
    public void mediaStart()
    {
        System.out.println("Song starts");
    }
    public void mediaStop()
    {
        System.out.println("Song stops");
    }

    public static void main(String[] args) {
        CarInterface c1 = new CarInterface();
        c1.brake();
    }

}
