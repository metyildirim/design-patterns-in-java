package com.JavaTest;

import Strategy.*;
import Observer.*;
import Decorator.*;

public class Main
{
    public static void main(String[] args)
    {
        //TEST STRATEGY PATTERN
        /*
        Airplane A400M = new A400M();
        Airplane F35LII = new F35LII();

        A400M.takeOff();
        A400M.fly();
        A400M.land();

        F35LII.takeOff();
        F35LII.fly();
        F35LII.land();
        */

        //TEST OBSERVER PATTERN
        /*
        CargoData cargoData = new CargoData("12A123d",
                "Blue Note6 Case",
                "12/A London, UK",
                "Beijing Airport");

        TrackCargoDisplay tcd = new TrackCargoDisplay(cargoData);
        CargoDisplay cd = new CargoDisplay(cargoData);

        cargoData.setLocation("Esenboga Airport, Turkey");
        cargoData.setLocation("London City Airport, UK");
        cargoData.setLocation("12/A London, UK");
        cargoData.setIsArrived(true);
        */

        //TEST DECORATOR PATTERN
        Pizza med = new MediumMenuPizza();
        med = new ExtraMozzarella(med);
        System.out.println(med.getDescription() + " ₺" + med.cost());

        Pizza big = new BigMenuPizza();
        big = new ExtraMozzarella(big);
        big = new PizzaSauce(big);
        System.out.println(big.getDescription() + " ₺" + big.cost());
    }
}