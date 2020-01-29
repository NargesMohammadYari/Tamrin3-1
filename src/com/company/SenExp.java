package com.company;

/**
 * Created by narges nastran on 01/29/2020.
 */
public class SenExp {
    public class sen extends Throwable{}
    public void sen(int x) throws SabteAhvalExo{
        if(x<=23){
            System.out.println("sen shoma kamtar az hade mojaz ast");
        }
        else throw new SabteAhvalExo("sen shoma b hade mojaz reside");
    }
}
