package Lista2POO;

public class Pregui�a extends Animais{
	private boolean sobeArvore;

//construtores
	public Pregui�a(String nome, int idade, boolean som, boolean sobeArvore) {
		super(nome, idade, som);
		this.sobeArvore = sobeArvore;
	}

//encapsulamento
	public boolean isSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
//metodos
	public void sobeArvore() {
		if (sobeArvore = true) {
			System.out.println("Pregui�a homem-aranha");
		}
		else if (sobeArvore = false) {
			System.out.println("Pregui�a pregui�osa");
		}
	}
}
