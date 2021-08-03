package lista2_LaçoDeCondição;

import java.util.Scanner;

public class Lista2JavaEx1 {
//Faça um programa que receba três inteiros e diga qual deles é o maior.
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int n1, n2, n3;
//entrada
		System.out.println("Insira o primeiro número inteiro: ");
		n1 = leia.nextInt();
		System.out.println("Insira o segundo número inteiro: ");
		n2 = leia.nextInt();
		System.out.println("Insira o terceiro número inteiro: ");
		n3 = leia.nextInt();
//tratamento
//saidas
		if (n1 > n2 && n1 > n3) {
			System.out.println("O primeiro valor inserido é o maior.");
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O segundo valor inserido é o maior.");
		}
		
		else if (n3 > n1 && n3 > n2) {
			System.out.println("O terceiro valor inserido é o maior.");
		}
		
	}

}
