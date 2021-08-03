package Exemplos;

	public class exemploIR {

	import java.util.*;
	import java.math.*;
	public class Exercicio_IR {

		public static void main(String[] args) 
		{
			Scanner leia = new Scanner(System.in);
			
			double salario;
			String nome;
			char id; //ele, ela, ellu
			
			System.out.println("Digite o nome: ");
			nome = leia.nextLine();
			System.out.println("Selecione Masculino[M], Feminimo [F] ou Neutro [E]: ");
			id = leia.next().charAt(0);
			System.out.println("Digite seu salário bruto: R$ ");
			salario = leia.nextDouble();
			
			 //<2000 isento
			//>2000 5000< 15%
			//>5000 25%
			
			if (salario<2000) 
			{
				System.out.println("Você está isento de imposto.");
			} else if (salario<=5000)
				{
					double salario15 = salario*0.15;
					System.out.println("Oi, %s, seu IR é: ",+salario15);
				}
			
		
			
			
		
		}

	}
