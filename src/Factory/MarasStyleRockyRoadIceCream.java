package Factory;

public class MarasStyleRockyRoadIceCream extends IceCream {
    public MarasStyleRockyRoadIceCream()
    {
        name = "Maras Style Rocky Road Ice Cream";
        sauce = "Special Maras Sauce";
    }

    @Override
    void box()
    {
        System.out.println("Boxing Ice Cream with Maras Ice Cream Store Box");
    }
}
