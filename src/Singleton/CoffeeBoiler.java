package Singleton;

public class CoffeeBoiler {
    private boolean empty;
    private boolean boiled;
    private static CoffeeBoiler uniqueInstance;

    private CoffeeBoiler() {
        empty = true;
        boiled = false;
    }

    public static CoffeeBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Coffee Boiler");
            uniqueInstance = new CoffeeBoiler();
        }
        System.out.println("Returning instance of Coffee Boiler");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
