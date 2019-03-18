package Factory;

public class AnkaraStyleMilkyIceCream extends IceCream {
    public AnkaraStyleMilkyIceCream()
    {
        name = "Ankara Style Milky Ice Cream";
        sauce = "Special Ankara Sauce";
    }

    @Override
    void box()
    {
        System.out.println("Boxing Ice Cream with Ankara Ice Cream Store Box");
    }
}
