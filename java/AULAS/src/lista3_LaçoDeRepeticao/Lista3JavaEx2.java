package lista3_LaçoDeRepeticao;

import java.util.Scanner;

public class Lista3JavaEx2 {
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int n, pares = 0, impares = 0;
	
	for (int x = 0; x < 10; x++) {
		System.out.println("Insira um número: ");
		n = leia.nextInt();
		if (n % 2 == 0) {
			pares ++;
		}
		else {
			impares ++;
		}
	}

	System.out.printf("Foram inseridos %d valores pares e %d valores ímpares", pares, impares);
	}

}
