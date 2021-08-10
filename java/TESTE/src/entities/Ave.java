package entities;
//Ave - pet - voa / verdadeiro ou falso - construtor

public class Ave extends Pet {
	private boolean voa;
	private String voaAux;
	
//construtores
	public Ave(String raca, String voaAux) {
		super(raca);
		this.voaAux = voaAux;
}
	public Ave(String raca, int anoNascimento, String voaAux) {
		super(raca, anoNascimento);
		this.voaAux = voaAux;
}

//encapsulamento
	public boolean isVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}

	public String getVoaAux() {
		return voaAux;
	}

	public void setVoaAux(String voaAux) {
		this.voaAux = voaAux;
	}
	
//metodos
	public void voa () {
		if (voaAux == "Sim") {
			voa = true;
			System.out.println("Zummmm");
		}
		else if (voaAux == "Não") {
			voa = false;
			System.out.println("*pula no chão*");
		}
	}
}
