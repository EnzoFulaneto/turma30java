package Lista1POO;

public class Aviao {
	private String tamanho;
	private int velocidade;
	private String marca;
	
	
	public Aviao(String tamanho, int velocidade, String marca) {
		super();
		this.tamanho = tamanho;
		this.velocidade = velocidade;
		this.marca = marca;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


	public int getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	

	}

