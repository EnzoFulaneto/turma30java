package Lista1;

import java.util.Scanner;

public class lista1ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int anos, meses, dias, totdias;
		
		System.out.println("Quantos anos você tem? ");
		anos = leia.nextInt();
		System.out.println("Quantos meses você tem? ");
		meses = leia.nextInt();
		System.out.println("Quantos dias você tem? ");
		dias = leia.nextInt();
		
		//totdias = (anos * 365) + (meses * 30) + dias
		totdias = ((anos * 365) + (meses * 30) + dias);
		System.out.println("Você está vivo à " +totdias+" dias"); 
	}
}
