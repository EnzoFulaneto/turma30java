package lista3_La�oDeRepeticao;

import java.util.Scanner;

public class Lista3JavaEx2 {
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int n, pares = 0, impares = 0;
	
	for (int x = 0; x < 10; x++) {
		System.out.println("Insira um n�mero: ");
		n = leia.nextInt();
		if (n % 2 == 0) {
			pares ++;
		}
		else {
			impares ++;
		}
	}

	System.out.printf("Foram inseridos %d valores pares e %d valores �mpares", pares, impares);
	}

}
