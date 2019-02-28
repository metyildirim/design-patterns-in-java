package Strategy;

public class A400M extends Airplane
{
    public A400M()
    {
        SetFlyBehavior(new FlyWithPistonEngine());
        SetLandingBehavior(new LandCTOL());
        SetTakeOffBehavior(new TakeOffCTOL());
    }
}
