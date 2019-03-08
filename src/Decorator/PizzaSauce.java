package Decorator;

public class PizzaSauce extends CondimentDecorator {
    private Pizza pizza;

    public PizzaSauce(Pizza p) {
        pizza = p;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pizza Sauce";
    }

    @Override
    public double cost() {
        return 0.25 + pizza.cost();
    }
}
