package lista2_La�oDeCondi��o;

import java.util.Scanner;

public class Lista2JavaEx1 {
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int n1, n2, n3;
//entrada
		System.out.println("Insira o primeiro n�mero inteiro: ");
		n1 = leia.nextInt();
		System.out.println("Insira o segundo n�mero inteiro: ");
		n2 = leia.nextInt();
		System.out.println("Insira o terceiro n�mero inteiro: ");
		n3 = leia.nextInt();
//tratamento
//saidas
		if (n1 > n2 && n1 > n3) {
			System.out.println("O primeiro valor inserido � o maior.");
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O segundo valor inserido � o maior.");
		}
		
		else if (n3 > n1 && n3 > n2) {
			System.out.println("O terceiro valor inserido � o maior.");
		}
		
	}

}
