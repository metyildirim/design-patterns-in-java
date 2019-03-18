package Factory;

public class AnkaraStyleRockyRoadIceCream extends IceCream {
    public AnkaraStyleRockyRoadIceCream()
    {
        name = "Ankara Style Rocky Road Ice Cream";
        sauce = "Special Ankara Sauce";
    }

    @Override
    void box()
    {
        System.out.println("Boxing Ice Cream with Ankara Ice Cream Store Box");
    }
}
