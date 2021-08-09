package Lista1POO;
//DUVIDA: COMOCHAMAR UM METODO
public class Lista1Ex1Cliente {

	public static void main(String[] args) {
	Cliente cliente1 = new Cliente ();
	
	cliente1.nome = "Enzo";
	cliente1.idade = 18;
	cliente1.sexo = 'M';
	cliente1.cod = 03;
	
	System.out.printf ("Olá, %s. Aqui estão os produtos selecionados pra você.!\n", cliente1.nome);
	System.out.printf ("Considerando que vocÊ tem %d anos e é do sexo %c confira essa seleção!!\n", cliente1.idade, cliente1.sexo);
	System.out.printf ("Seu código é %d.", cliente1.cod);
	}

}
