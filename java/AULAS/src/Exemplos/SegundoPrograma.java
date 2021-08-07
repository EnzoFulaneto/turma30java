import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String nome;
		int anoNascimento;
		int idade;
		
		System.out.println("Qual seu nome? ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento? ");
		anoNascimento = leia.nextInt();
		idade = 2021 - anoNascimento;
		System.out.println("Olá, "+nome+". Sua idade é "+idade);
	}
}

/*
 * public class SegundoPrograma 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in); //criar um teclado 
		String nome;
		int anoNascimento;
		int idade;
			
		System.out.print("Digite o nome: \n");
		nome = leia.nextLine();
		System.out.println("Digite o ano de nascimento");
		anoNascimento = leia.nextInt();
		idade = 2021 - anoNascimento;
		System.out.println("Oi "+nome+" sua idade é "+idade+" anos!!!");
		
	}
	
}

 */

