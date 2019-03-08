package Strategy;

public class Airplane {
    private FlyBehavior flyBehavior;
    private LandingBehavior landingBehavior;
    private TakeOffBehavior takeOffBehavior;

    //Airplane Methods
    public void fly() {
        flyBehavior.fly();
    }

    public void takeOff() {
        takeOffBehavior.takeOff();
    }

    public void land() {
        landingBehavior.land();
    }

    //Behavior Setters
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setLandingBehavior(LandingBehavior lb) {
        landingBehavior = lb;
    }

    public void setTakeOffBehavior(TakeOffBehavior tb) {
        takeOffBehavior = tb;
    }
}