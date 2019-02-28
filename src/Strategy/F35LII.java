package Strategy;

public class F35LII extends Airplane
{
    public F35LII()
    {
        SetFlyBehavior(new FlyWithJetEngine());
        SetLandingBehavior(new LandSTOL());
        SetTakeOffBehavior(new TakeOffSTOL());
    }
}
