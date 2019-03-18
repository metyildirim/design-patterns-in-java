package Factory;

public class MarasStyleMilkyIceCream extends IceCream {
    public MarasStyleMilkyIceCream()
    {
        name = "Maras Style Milky Ice Cream";
        sauce = "Special Maras Sauce";
    }

    @Override
    void box()
    {
        System.out.println("Boxing Ice Cream with Maras Ice Cream Store Box");
    }
}
