package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws SabteAhvalExo {
	MeliatExp nationality=new MeliatExp();
	SenExp age=new SenExp();
	TahsilatExp t=new TahsilatExp();
	Scanner scanner=new Scanner(System.in);
	Scanner scan=new Scanner(System.in);
	String madrak;
	String meliat;
	int sen;
        System.out.println("meliat ra vared konid:");
        meliat=scanner.nextLine();
        nationality.Nationallity(meliat);
        System.out.println("sen ra vared konid:");
        sen=scanner.nextInt();
        age.sen(sen);
        System.out.println("tahsilat ra vared konid");
        madrak=scan.nextLine();
        t.Tahsilat(madrak);
    }
}
