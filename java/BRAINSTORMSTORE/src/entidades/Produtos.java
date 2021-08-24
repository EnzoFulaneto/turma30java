package entidades;


public class Produtos {

//---------ATRIBUTOS
	private String produto;
	private String cod;
	private String preco;
	private int estoque;

//------------CONSTRUTORES
	public Produtos(String cod, String preco, int estoque, String produto) {
		super();
		this.cod = cod;
		this.produto = produto;
		this.preco = preco;
		this.estoque = estoque;
		}

//----------ENCAPSULAMENTO
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}	
	
//METODOS
	if ()
}