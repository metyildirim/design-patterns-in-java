package Strategy;

public class TakeOffCTOL implements TakeOffBehavior {
    public void takeOff() {
        System.out.println("The plane is taking off conventionally");
    }
}
