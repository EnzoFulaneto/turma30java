package lista3_La�oDeRepeticao;

import java.util.Scanner;

public class Lista3JavaEx5 {
//leia um n�mero do teclado at� que encontre um n�mero igual a zero.mostre a soma dos n�meros digitados.(DO...WHILE)
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int valor = 0, soma = 0;
	do {
		System.out.println("Insira um valor: ");
		valor = leia.nextInt();
		soma += valor;
	}while (valor != 0);
		
	System.out.println("A soma dos valores inseridos � de "+soma);
	
	}
}