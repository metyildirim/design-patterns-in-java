package com.JavaTest;

import Strategy.*;

public class Main
{
    public static void main(String[] args)
    {
        //TEST STRATEGY DESIGN
        Airplane A400M = new A400M();
        Airplane F35LII = new F35LII();

        A400M.TakeOff();
        A400M.Fly();
        A400M.Land();

        F35LII.TakeOff();
        F35LII.Fly();
        F35LII.Land();
    }
}
