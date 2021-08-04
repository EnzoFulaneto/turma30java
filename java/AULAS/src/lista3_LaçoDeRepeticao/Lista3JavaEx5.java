package lista3_LaçoDeRepeticao;

import java.util.Scanner;

public class Lista3JavaEx5 {
//leia um número do teclado até que encontre um número igual a zero.mostre a soma dos números digitados.(DO...WHILE)
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int valor = 0, soma = 0;
	do {
		System.out.println("Insira um valor: ");
		valor = leia.nextInt();
		soma += valor;
	}while (valor != 0);
		
	System.out.println("A soma dos valores inseridos é de "+soma);
	
	}
}