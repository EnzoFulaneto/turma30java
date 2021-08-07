package programas;

import java.util.Scanner;

//DUVIDAS : COMO ALINHAR AS COLUNAS 
//RESPOSTA: DEIXA O GRANDE POR ULTIMO

public class CadAluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String alunes[] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corrêa de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","Cássia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","Fábio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Flávio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","João Pedro Cruz Gomes","José Paulo de Matos Ferreira Neto","Letícia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Natália Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vinícios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};
		int notas[] = new int[alunes.length];
		String matriculas[] = new String[alunes.length];  //MAT-0X
		String obs[] = new String[alunes.length];
		String opcao[] = new String[alunes.length];
		int matricula;
		boolean ativo[] = new boolean[alunes.length]; //true 
		char op = 'S', opAtivo = 'S';
		
		//Mostra os cods, nomes e notas
			System.out.print("|MATRÍCULA\t|");
			System.out.print("NOTAS\t");
			System.out.print("|ALUNES\n");
		for (int x = 0; x < alunes.length; x++) {
			if (x < 10) {
				System.out.print ("|MAT-0"+x+"\t\t|");
			}
			else {
				System.out.print ("|MAT-"+x+"\t\t|");
			}
			System.out.print (notas[x]+"\t");
			System.out.print ("|"+alunes[x]+"\n");
		}	
		
		//Pede para inserir o cod matricula
		do {
				System.out.println("Qual seu número de matrícula(Somente o número)? ");
				matricula = leia.nextInt();
					System.out.print ("|MAT-"+matricula+"\t\t");
					System.out.print (notas[matricula]+"\t");
					System.out.print (alunes[matricula]+"\n");
					
		//Pergunta se o aluno está ativo
				System.out.println("O aluno está ativo? [S/N] ");
				opAtivo = leia.next().toUpperCase().charAt(0);
				if (opAtivo == 'S') {
					ativo[matricula] = true;
					opcao[matricula] = "Ativo";
				}
				else if (opAtivo == 'N') {
					ativo[matricula] = false;
					opcao[matricula] = "Inativo";
				}
				else {
					System.out.println("Resposta inválida!");
				}
				
				//Pergunta a nota do aluno
				System.out.println("Insira a nota do aluno: ");
				notas[matricula] = leia.nextInt();
				if (notas[matricula] > 5) {
					obs[matricula] = "Ótimo, continue assim!!!";
				}
				else {
					obs[matricula] = "Estude mais!!";
				}
				
				//Pergunta se deseja continuar
				System.out.println("Deseja continuar? [S/N] ");
				op = leia.next().toUpperCase().charAt(0);
		} while(op == 'S');
		
		//Fim do programa mostrando os dados inseridos pelo usuario
		System.out.print("|MATRÍCULA\t");
		System.out.print("NOTAS\t");
		System.out.print("ATIVO\t");
		System.out.print("MÉDIA\n");
		
		for (int x = 0; x < alunes.length; x++) {
		if (ativo[x] == true) {
			
		if (x < 10) {
			System.out.print ("|MAT-0"+x+"\t\t");
		}
		else {
			System.out.print ("|MAT-"+x+"\t\t");
		}
		System.out.print (notas[x]+"\t");
		System.out.print (opcao[x]+"\t");
		System.out.print (obs[x]+"\n");
		}	
		}
		//informar a nota deste aluno - FEITO
		//vai informar se o aluno ainda continua ativo ou não. O usuario não pode digitar true ou false - FEITO
		//tem que fazer o processo até que pergunta continua sim ou não seja não - FEITO
		//após mostra todos os alunos com nota pela regra - FEITO
		// até 5 - estude mais
		// acima de 5 - otimo, continue assim
		// aluno inativo ou aluno ativo baseado no true ou false de ativo
		//somente dos alunos que tem nota

	}

}
