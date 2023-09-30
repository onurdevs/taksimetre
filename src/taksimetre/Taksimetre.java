package taksimetre;

import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometrebasi = 2.20;
		double minimum = 20;
		double acilis = 10;
		double kilometre;
		
		double tutar;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kilometre giriniz: ");
		kilometre = scan.nextDouble();
		tutar = acilis+(kilometre * kilometrebasi);
		
		
		if(tutar < minimum) {
			tutar = minimum;
		}
		
		System.out.println("Tutar: "+ tutar);
		
		
	}

}
