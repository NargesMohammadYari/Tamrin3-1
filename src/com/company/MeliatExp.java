package com.company;

/**
 * Created by narges nastran on 01/29/2020.
 */
public class MeliatExp {

    public class Nationallity extends Throwable{}
    public static void Nationallity(String meliat)throws SabteAhvalExo{
        if(meliat.equals("rusiei")){
            System.out.println("meliat ghabele ghbol ast");
        }else throw new SabteAhvalExo("meliat maghbol nist");
    }
}
