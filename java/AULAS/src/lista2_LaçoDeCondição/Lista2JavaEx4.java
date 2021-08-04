package lista2_LaçoDeCondição;

import java.util.Scanner;

public class Lista2JavaEx4 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int numero;
	double quadrada, potencia;
	
//entradas: um número qualquer e exiba se este número é par ou ímpar.
	System.out.println("Escreva um número qualquer: ");
	numero = leia.nextInt();
//tratamento: Potência - Math.pow (x, 2) /Raiz Quadrada - Math.sqrt
//saidas: Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
			if (numero % 2 == 0) {
				quadrada = Math.sqrt(numero);
				System.out.printf("%d é um número par, cuja raiz quadrada é %f",numero, quadrada);
			}
			else if (numero % 2 == 1) {
				potencia = Math.pow(numero, 2);
				System.out.printf("%d é um número ímpar, que elevado ao quadrado resulta em %f",numero, potencia);
			}
			else if (numero == 0) {
				System.out.println("0 é neutro!!");
			}
	}

}
