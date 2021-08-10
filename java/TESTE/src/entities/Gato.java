package entities;

public class Gato extends Pet{
	private boolean miadoAlto;
	private String miadoAux;

//construtores
	public Gato(String raca, String miadoAux) {
		super(raca);
		this.miadoAux = miadoAux;
	}
	
	public Gato(String raca, boolean miadoAlto, int anoNascimento) {
		super(raca, anoNascimento);
		this.miadoAlto = miadoAlto;
	}

	//encapsulamento
	public boolean isMiadoAlto() {
		return miadoAlto;
	}

	public void setMiadoAlto(boolean miadoAlto) {
		this.miadoAlto = miadoAlto;
	}

	public String getMiadoAux() {
		return miadoAux;
	}

	public void setMiadoAux(String miadoAux) {
		this.miadoAux = miadoAux;
	}

//metodos
	public void miadoAlto() {
		if (miadoAux == "Sim") {
			miadoAlto = true;
		}
		else if (miadoAux == "Não") {
			miadoAlto = false;
		}
	}
	@Override
	public void emiteSom() {
		System.out.print("Emitindo o som do bicho....");{
		if (miadoAlto = true) {
			System.out.print("MIAU, MIAU, MIAU");
		}
		else if (miadoAlto = false) {
			System.out.println("miau, miau, miau");
		}
	}
}
}
