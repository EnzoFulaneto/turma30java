package Lista2POO;

public class Cavalo extends Animais{
//atributos
	private boolean correr;

//construtores
	public Cavalo(String nome, int idade, boolean som, boolean correr) {
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
	public void correr () {
		if (correr = true) {
			System.out.println("Pocotó, pocotó, pocotó");
		}
		else if (correr = false) {
			System.out.println("pocotó preguiçoso");
		}
	}
		
		@Override
		public void som() {
			if (isSom() == true ) {
				System.out.println("O animal faz POCOTÓ");
			}
			else if (isSom() == false) {
				System.out.println("O animal está cansado e não quer fazer sons");
			}
	}
}
