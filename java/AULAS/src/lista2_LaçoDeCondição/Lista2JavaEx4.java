package lista2_La�oDeCondi��o;

import java.util.Scanner;

public class Lista2JavaEx4 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int numero;
	double quadrada, potencia;
	
//entradas: um n�mero qualquer e exiba se este n�mero � par ou �mpar.
	System.out.println("Escreva um n�mero qualquer: ");
	numero = leia.nextInt();
//tratamento: Pot�ncia - Math.pow (x, 2) /Raiz Quadrada - Math.sqrt
//saidas: Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
			if (numero % 2 == 0) {
				quadrada = Math.sqrt(numero);
				System.out.printf("%d � um n�mero par, cuja raiz quadrada � %f",numero, quadrada);
			}
			else if (numero % 2 == 1) {
				potencia = Math.pow(numero, 2);
				System.out.printf("%d � um n�mero �mpar, que elevado ao quadrado resulta em %f",numero, potencia);
			}
			else if (numero == 0) {
				System.out.println("0 � neutro!!");
			}
	}

}
