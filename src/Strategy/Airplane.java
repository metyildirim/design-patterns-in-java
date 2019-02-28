package Strategy;

public class Airplane
{
    private FlyBehavior flyBehavior;
    private LandingBehavior landingBehavior;
    private TakeOffBehavior takeOffBehavior;

    //Airplane Methods
    public void Fly()
    {
        flyBehavior.Fly();
    }

    public void TakeOff()
    {
        takeOffBehavior.TakeOff();
    }

    public void Land()
    {
        landingBehavior.Land();
    }

    //Behavior Setters
    public void SetFlyBehavior(FlyBehavior fb)
    {
        flyBehavior = fb;
    }

    public void SetLandingBehavior(LandingBehavior lb)
    {
        landingBehavior = lb;
    }

    public void SetTakeOffBehavior(TakeOffBehavior tb)
    {
        takeOffBehavior = tb;
    }
}