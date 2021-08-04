package lista3_LaçoDeRepeticao;

import java.util.Scanner;

public class Lista3JavaEx3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int idade = 0, tot21 = 0, tot50 = 0;
	
//entradas: Solicitar a idade de várias pessoas
	while (idade != -99) {
		System.out.println("Qual a sua idade (Se desejar parar digite -99)? ");
		idade = leia.nextInt();
		if (idade < 0) {
			System.out.println("Insira uma idade válida!!");
		}
		if (idade < 21 && idade >= 0) {
			tot21 ++;
		}
		else if (idade > 50) {
			tot50 ++;
		}
	}
//processamento:  O programa termina quando a idade for =-99. (WHILE)
//saidas:Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.
	System.out.printf("Foram registradas %d pessoas com menos de 21 anos e %d pessoas com mais de 50 anos", tot21, tot50);
	}

}
