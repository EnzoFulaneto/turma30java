package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceiro;

public class ProgramaTeste {
	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
	char op;
	
	List <Funcionario> folha = new ArrayList<>();
	char tipo;
	do {
		System.out.println("Funcionário (F) ou Terceirizado (T)? ");
		tipo = leia.next().toUpperCase().charAt(0);
		System.out.println("Insira o número de mátricula: ");
		String matricula = leia.next();
		System.out.println("Digite as horas trabalhadas? ");
		int horasTrabalhadas = leia.nextInt();
		System.out.println("Quanto você recebe por hora? R$");
		double valorPorHora = leia.nextDouble();
		if (tipo == 'T') {
			System.out.println("Quanto você recebe de adicionais? R$");
			double adicional = leia.nextDouble();
			folha.add(new Terceiro(matricula, horasTrabalhadas, valorPorHora, adicional));
		}
		else if (tipo == 'F') {
			folha.add(new Funcionario(matricula, horasTrabalhadas, valorPorHora));
		}
		System.out.println("Deseja continuar [S/N]? ");
		op = leia.next().toUpperCase().charAt(0);

	}while(op == 'S');
	
	for (Funcionario func : folha) {
		System.out.printf ("%s, seu salário foi de %.2f\n", func.getMatricula(), func.getsalario());
	}
	}
}
