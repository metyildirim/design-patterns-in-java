package Strategy;

public class F35LII extends Airplane {
    public F35LII() {
        setFlyBehavior(new FlyWithJetEngine());
        setLandingBehavior(new LandSTOL());
        setTakeOffBehavior(new TakeOffSTOL());
    }
}
