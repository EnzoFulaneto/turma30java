package lista3_LaçoDeRepeticao;

import java.util.Scanner;

public class Lista3JavaEx4 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int idade = 0, sexo = 0, mood = 0, cont= 0;
	int mulher= 0, homem = 0, outros = 0;
	int calma = 0, nervosa = 0, agressiva = 0;
	int mulherNervosa = 0, homemAgressivo = 0, outroCalmo = 0;
	int nervosos40 = 0, calmos18 = 0;
	
	while (cont < 5) {
		System.out.println("Quantos anos você tem? ");
		idade = leia.nextInt();
		
		System.out.println("Qual seu sexo (1-Feminino/2-Masculino/3-Outros)? ");
		sexo = leia.nextInt();
		if(sexo == 1) {
			mulher ++;
		}
		else if (sexo == 2) {
			homem ++;
		}
		else if (sexo == 3) {
			outros ++;
		}
		else {
			System.out.println("Insira um valor válido.");
		}
	}
		System.out.println("Qual é seu humor(1-Calma/2-Nervosa/3-Agressiva)? ");
		mood = leia.nextInt();
		if (mood == 1) {
			calma ++;
		}
		else if (mood == 2) {
			nervosa ++;
		}
		else if (mood == 3) {
			agressiva ++;
		}
		cont++;
		
		if (sexo == 1 && mood == 2 ) {
			mulherNervosa ++;
		}
		if (sexo == 2 && mood == 3) {
			homemAgressivo++;
		}
		if (sexo == 3 && mood == 1) {
			outroCalmo++;
		}
		if (idade > 40 && mood == 2) {
			nervosos40++;
		}
		if (idade < 18 && mood == 1) {
			calmos18++;
		}
		
	
		System.out.println("O número de pessoas calmas é de "+calma);
		System.out.println("O número de mulheres nervosas é de "+mulherNervosa);
		System.out.println("O número de homens agressivos é de "+homemAgressivo);
		System.out.println("O número de outros agressivos é de "+outroCalmo);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é de "+nervosos40);
		System.out.println("O número de pessoas calmas com menos de 18 anos é de "+calmos18);
	}
}

