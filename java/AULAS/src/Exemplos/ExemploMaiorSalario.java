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
		System.out.println("Qual seu sal�rio? ");
		salario = leia.nextInt();
	if (salario > maiorSalario) {
		maiorSalario = salario;
		maiorNome = nome;
		}
	}
	
	System.out.printf("O maior sal�rio inserido foi %d, que � o sal�rio do(a) %s.", maiorSalario, maiorNome);
		
	}

}
