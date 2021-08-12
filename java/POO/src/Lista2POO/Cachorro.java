package Lista2POO;

public class Cachorro extends Animais{
	private boolean correr;

//construtores
	public Cachorro(String nome, int idade, boolean som, boolean correr) {
		super(nome, idade, som);
		this.correr = correr;
	}
	
//encapsulamento
	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
//metodos 
	public void correr (boolean correr) {
		if (correr = true) {
			System.out.println("Au Au rápidinho");
		}
		else if (correr = false) {
			System.out.println("Ai Au preguiçoso");
		}
	}
	@Override
	public void som() {
		if (isSom() == true ) {
			System.out.println("O animal faz AUAU");
		}
		else if (isSom() == false) {
			System.out.println("O animal está cansado e não quer fazer sons");
		}
	}
}
