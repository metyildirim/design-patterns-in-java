package Strategy;

public class TakeOffCTOL implements TakeOffBehavior
{
    public void TakeOff()
    {
        System.out.println("The plane is taking off conventionally");
    }
}
