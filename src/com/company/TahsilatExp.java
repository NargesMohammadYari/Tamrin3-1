package com.company;

/**
 * Created by narges nastran on 01/29/2020.
 */
public class TahsilatExp {
    public class Tahsilat extends Throwable{}
    public static void Tahsilat(String madrak)throws SabteAhvalExo{
        System.out.println("tasilat shoma che mizan ast?");
        if(madrak.equals("lisans")){
            System.out.println("tahsilat madrak ghabele ghabol ast");
        }
        else throw new SabteAhvalExo("tahsilat madrak ghabele ghabol nis");
    }
}
