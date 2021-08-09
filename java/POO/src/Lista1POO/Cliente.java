package Lista1POO;

public class Cliente {
	public String nome;
	public int idade;
	public char sexo;
	public int cod;


	public void idade () {
		if (idade < 18) {
			System.out.println("Está é a seleção de produtos para menores de idade!!");
		}
		else {
			System.out.println("Está é a seleção de produtos para maiores de idade!!");
		}
	}
	
	public void sexo () {
		if(sexo == 'M') {
			System.out.println("Masculino");
		}
		else if (sexo == 'F')
			System.out.println("Feminino");
	}
}

	
