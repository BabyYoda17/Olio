package app;

import java.util.Scanner;

import data.Tiskikone;

public class Suurkeittio {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiskikone tk1=new Tiskikone();
		lueTiskikone(tk1);
		Tiskikone tk2=new Tiskikone();
		lueTiskikone(tk2);
		tulosta(tk1);
		tulosta(tk2);
		
		Tiskikone tk3=new Tiskikone(103, "Bosch", "Iso", 100);
		tulosta(tk3);
		
	}

	
	private static void lueTiskikone(Tiskikone x) {
		System.out.print("Anna id: ");
		String s=sc.nextLine();
		int i=Integer.parseInt(s);
		x.setId(i);

		System.out.print("Anna merkki: ");
		s=sc.nextLine();
		x.setMerkki(s);
		
		System.out.print("Anna malli: ");
		s=sc.nextLine();
		x.setMalli(s);
		
		System.out.print("Anna pesuohjelma: ");
		s=sc.nextLine();
		i=Integer.parseInt(s);
		x.setPesuohjelma(i);
	}


	private static void tulosta(Tiskikone tk) {
		System.out.println(tk);
	}
}

