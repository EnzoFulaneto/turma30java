package Lista1POO;
//DUVIDA: COMOCHAMAR UM METODO
public class Lista1Ex1Cliente {

	public static void main(String[] args) {
	Cliente cliente1 = new Cliente ();
	
	cliente1.nome = "Enzo";
	cliente1.idade = 18;
	cliente1.sexo = 'M';
	cliente1.cod = 03;
	
	System.out.printf ("Ol�, %s. Aqui est�o os produtos selecionados pra voc�.!\n", cliente1.nome);
	System.out.printf ("Considerando que voc� tem %d anos e � do sexo %c confira essa sele��o!!\n", cliente1.idade, cliente1.sexo);
	System.out.printf ("Seu c�digo � %d.", cliente1.cod);
	}

}
