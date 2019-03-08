package Decorator;

public class MediumMenuPizza extends Pizza {

    public MediumMenuPizza() {
        description = "Medium Menu Pizza";
    }

    @Override
    public double cost() {
        return 9.99;
    }
}
