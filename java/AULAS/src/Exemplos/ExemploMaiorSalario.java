package Exemplos;

import java.util.Scanner;

public class ExemploMaiorSalario {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int salario = 1, maiorSalario = 0;
	String nome, maiorNome = "";
	char op;
	
	while  (salario > 0) {
		System.out.println("Qual seu nome? ");
		nome = leia.next().toUpperCase();
		System.out.println("Qual seu salário? ");
		salario = leia.nextInt();
	if (salario > maiorSalario) {
		maiorSalario = salario;
		maiorNome = nome;
		}
	}
	
	System.out.printf("O maior salário inserido foi %d, que é o salário do(a) %s.", maiorSalario, maiorNome);
		
	}

}
