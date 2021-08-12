package Lista2POO;

public class Animais {

	private String nome;
	private int idade;
	protected boolean som;
	
	//construtores
	public Animais(String nome, int idade, boolean som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}

	//encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}
	
//metodos	
	public void som() {
		if (som = true ) {
			System.out.println("O animal faz ");
		}
		else if (som = false) {
			System.out.println("O animal está cansado e não quer fazer sons");
		}
	}
	
}
