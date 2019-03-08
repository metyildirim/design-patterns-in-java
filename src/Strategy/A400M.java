package Strategy;

public class A400M extends Airplane {
    public A400M() {
        setFlyBehavior(new FlyWithPistonEngine());
        setLandingBehavior(new LandCTOL());
        setTakeOffBehavior(new TakeOffCTOL());
    }
}
