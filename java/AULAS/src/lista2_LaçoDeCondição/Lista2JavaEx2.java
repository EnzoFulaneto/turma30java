package lista2_La�oDeCondi��o;

import java.util.Scanner;

//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
public class Lista2JavaEx2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int n1, n2, n3;
		
		System.out.println("Insira o primeiro valor:");
		n1 = leia.nextInt();
		System.out.println("Insira o segundo valor:");
		n2 = leia.nextInt();
		System.out.println("Insira o terceiro valor:");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n2 > n3) {
			System.out.println(n1+"\n"+n2+"\n"+n3);
		}
	}

}
