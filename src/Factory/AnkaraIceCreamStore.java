package Factory;

public class AnkaraIceCreamStore extends IceCreamStore {
    @Override
    IceCream createIceCream(String item) {
        if (item == "Milky") {
            return new AnkaraStyleMilkyIceCream();
        } else if (item == "Rocky Road") {
            return new AnkaraStyleRockyRoadIceCream();
        } else {
            System.out.println("Error! invalid ice cream name!");
            return null;
        }
    }
}
