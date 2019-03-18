package Factory;

public abstract class IceCreamStore {
    abstract IceCream createIceCream(String item);

    public IceCream orderIceCream(String type){
        IceCream icrm = createIceCream(type);
        System.out.println();
        System.out.println("Making your " + icrm.toString() + "...");
        icrm.prepare();
        icrm.addSauce();
        icrm.box();
        return icrm;
    }
}
