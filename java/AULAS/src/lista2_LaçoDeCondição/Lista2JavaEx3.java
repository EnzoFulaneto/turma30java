package lista2_LaçoDeCondição;

import java.util.Scanner;

/*
 * 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */
public class Lista2JavaEx3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int idade;
	String nome;
	
	System.out.println("Qual seu nome? ");
	nome = leia.next();
	System.out.println("Qual a sua idade? ");
	idade = leia.nextInt();
	if (idade >= 10 && idade <= 14) {
		System.out.printf("Olá, %s. Sua idade é %d, portanto você está na categoria infantil!!", nome, idade);
	}
	else if (idade > 14 && idade < 18) {
		System.out.printf("Olá, %s. Sua idade é %d, portanto você está na categoria juvenil!!", nome, idade);
	}
	else if (idade > 17 && idade < 26) { 
		System.out.printf("Olá, %s. Sua idade é %d, portanto você está na categoria adulta!!", nome, idade);
	}
	else {
		System.out.printf("Olá, %s. Sua idade é %d e infelizmente ainda não temos categorias nessa idade :(", nome, idade);
	}
	
		

	}
}


