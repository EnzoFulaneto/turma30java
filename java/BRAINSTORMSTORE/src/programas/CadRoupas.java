package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produtos;

public class CadRoupas {

	public static void main(String[] args) {
//================INST�NCIAS
		List <Produtos> produto = new ArrayList<>();
		Scanner leia = new Scanner (System.in);
//=================VARI�VEIS==============================
		char op;
		String LendoCodigo;
		int pos;
		
//============= NOME, SLOGAN E DESEJA COMPRAR ==================
	System.out.println("===================================================");
	System.out.println("=============== BRAINSTORM STORE ==================");
	System.out.println("=========== The Real Slim Streetwear ==============");
	System.out.println("===================================================\n");
	System.out.print  ("Deseja fazer sua compra [S/N]? ");
	op = leia.next().toUpperCase().charAt(0);
	if (op == 'N') {
		System.out.println("Obrigado pela visita! Volte Sempre!!");
	} else if (op == 'S') {
		
		//---------------------INSERINDO OS ITENS DO CAT�LOGO
		produto.add(new Produtos("G-01", "R$40",10,"Camiseta Nike B�sica"));
		produto.add(new Produtos("G-02", "R$45",10,"Camiseta Adidas Retr�"));
		produto.add(new Produtos("G-03", "R$50",10,"Camiseta High Surfing Eye"));
		produto.add(new Produtos("G-04", "R$40",10,"Camiseta Nike Colorida"));
		produto.add(new Produtos("G-05", "R$45",10,"Camiseta Adidas Pok�mon"));
		produto.add(new Produtos("G-06", "R$50",10,"Camiseta High B�sica"));
		produto.add(new Produtos("G-07", "R$40",10,"Camiseta Overcome B�sica"));
		produto.add(new Produtos("G-08", "R$45",10,"Camiseta Jordan B�sica"));
		produto.add(new Produtos("G-09", "R$50",10,"Camiseta Jordan Refletiva"));
		produto.add(new Produtos("G-10", "R$40",10,"Camiseta Jordan Refletiva"));

//------------------APRESENTANDO O CAT�LOGO E PEDINDO O C�DIGO		
		System.out.println("---------------------------------------------------");
		System.out.println("|                   CAT�LOGO                      |");
		System.out.println("---------------------------------------------------");
		System.out.println("|COD\t |PRE�O\t |ESTOQUE\t |PRODUTO");
		for (Produtos loja : produto) {
			System.out.printf ("|%s\t |%s\t |%d\t\t |%s\n", loja.getCod(), loja.getPreco(), loja.getEstoque(), loja.getProduto());
		}
		
//------------------LENDO E PROCURANDO O C�DIGO NA LISTA
		System.out.print ("Insira o c�digo do produto desejado: ");
		LendoCodigo = leia.next().toUpperCase();
				
		if (LendoCodigo.length() <= 2) {
			LendoCodigo = ("G6-"+ LendoCodigo);
		}
		if (LendoCodigo)
				
	}
	else {
		System.out.println("RESPOSTA INV�LIDADA!!!");
	}
	}

}
