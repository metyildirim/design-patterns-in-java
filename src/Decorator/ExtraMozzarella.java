package Decorator;

public class ExtraMozzarella extends CondimentDecorator {
    private Pizza pizza;

    public ExtraMozzarella(Pizza p) {
        pizza = p;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Mozzarella";
    }

    @Override
    public double cost() {
        return 2 + pizza.cost();
    }
}
