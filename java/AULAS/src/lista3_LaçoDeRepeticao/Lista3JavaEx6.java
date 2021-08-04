package lista3_LaçoDeRepeticao;

import java.util.Scanner;

public class Lista3JavaEx6 {
//receba vários números inteiros no teclado/Final imprimir a média dos números múltiplos de 3/Para sair digita 0(zero).(DO...WHILE)
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int valor = 0, media = 0, soma = 0, cont = 0; 
	
	do {
		System.out.println("Insira um valor: ");
		valor = leia.nextInt();
		cont ++;
		soma += valor;
	}while (valor != 0);
	
	media = soma / (cont - 1);
	
	System.out.println("A média dos valores inseridos foi de "+media);
	}

}
