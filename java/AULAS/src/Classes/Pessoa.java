package Classes;
//nome, cpf, ano de nascimento e gênero/pronome
public class Pessoa {
	public String nome;
	public int anoNascimento;
	public String cpf;
	public char pronome;
	public boolean ativo;
	
	public Pessoa(String nome, int anoNascimento, String cpf, char pronome, boolean ativo) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.cpf = cpf;
		this.pronome = pronome;
		this.ativo = ativo;
	}
	

}
