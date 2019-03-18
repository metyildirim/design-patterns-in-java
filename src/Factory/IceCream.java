package Factory;

public abstract class IceCream {
    String name;
    String sauce;

    void prepare(){
        System.out.println("Preparing " + name);
    }

    void addSauce(){
        System.out.println("Adding " + sauce);
    }

    void box(){
        System.out.println("Boxing Ice Cream");
    }

    public String toString(){
        return name;
    }
}
