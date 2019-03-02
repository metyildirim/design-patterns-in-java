package com.JavaTest;

import Observer.CargoData;
import Observer.CargoDisplay;
import Observer.TrackCargoDisplay;
import Strategy.*;

public class Main
{
    public static void main(String[] args)
    {
        //TEST STRATEGY PATTERN
        /*
        Airplane A400M = new A400M();
        Airplane F35LII = new F35LII();

        A400M.TakeOff();
        A400M.Fly();
        A400M.Land();

        F35LII.TakeOff();
        F35LII.Fly();
        F35LII.Land();
        */

        //TEST OBSERVER PATTERN
        CargoData cargoData = new CargoData("12A123d",
                "Blue Note6 Case",
                "12/A London, UK",
                "Beijing Airport");

        TrackCargoDisplay tcd = new TrackCargoDisplay(cargoData);
        CargoDisplay cd = new CargoDisplay(cargoData);

        cargoData.SetLocation("Esenboga Airport, Turkey");
        cargoData.SetLocation("London City Airport, UK");
        cargoData.SetLocation("12/A London, UK");
        cargoData.SetIsArrived(true);
    }
}