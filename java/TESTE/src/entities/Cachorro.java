package entities;
// latidoAlto / verdadeiro ou falso - boolean - construtor

public class Cachorro extends Pet{
	private boolean latidoAlto;
	private String latidoAux;
	
//construtores
	
	public Cachorro(String raca, int anoNascimento, String latidoAux) {
		super(raca, anoNascimento);
		this.latidoAux = latidoAux;
	}

	public Cachorro(String raca, String latidoAux) {
		super(raca);
		this.latidoAux = latidoAux;
}

//encapsulamento
	public boolean isLatidoAlto() {
		return latidoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}

//metodos
	public void latidoAlto() {
	if (latidoAux == "Sim") {
		latidoAlto = true;
	}
	else if (latidoAux == "Não") {
		latidoAlto = false;
	}
	}
	@Override
	public void emiteSom() {
		System.out.print("Emitindo o som do bicho....");{
		if (latidoAlto = true) {
			System.out.print("AU, AU, AU");
		}
		else if (latidoAlto = false) {
			System.out.println("au, au, au");
		}
	}
}
}