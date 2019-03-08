package Decorator;

public class BigMenuPizza extends Pizza {

    public BigMenuPizza() {
        description = "Big Menu Pizza";
    }

    @Override
    public double cost() {
        return 14.99;
    }
}
