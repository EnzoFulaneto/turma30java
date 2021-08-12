package Lista2POO;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
	public static void main (String[] args) {
		
		List <String> produtos = new ArrayList<>();
//Armazenar dados da List
		produtos.add("Martelo");
		produtos.add("Marreta");
		produtos.add("Tabua");
		produtos.add("Pacote de Pregos");
		
		for (String estoque: produtos) {
			System.out.println(estoque);
		}
		
//Remover dados da list
		produtos.remove("Marreta");
		
//Atualizar e apresentar todos os dados da list
		System.out.println("\nUTILIZANDO O REMOVE:");
		for (String estoque: produtos) {
			System.out.println(estoque);
		}
	}
}
