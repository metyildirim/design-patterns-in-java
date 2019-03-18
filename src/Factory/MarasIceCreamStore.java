package Factory;

public class MarasIceCreamStore extends IceCreamStore {
    @Override
    IceCream createIceCream(String item) {
        if(item == "Milky"){
            return new MarasStyleMilkyIceCream();
        }else if(item == "Rocky Road")
        {
            return new MarasStyleRockyRoadIceCream();
        }
        else{
            System.out.println("Error! invalid ice cream name!");
            return null;
        }
    }
}
