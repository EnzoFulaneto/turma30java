package entidades;
//método calculoSalario retorna salario(double)

public class Funcionario {
	private String matricula;
	private int horasTrabalhadas;
	private double valorPorHora;
	private double salario;
	
//construtores
	public Funcionario(String matricula, int horasTrabalhadas, double valorPorHora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}

//encapsulamento
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	public double getsalario() {
		return salario;
	}

	public void setsalario(double salario) {
		this.salario = salario;
	}
	
//metodos	
	public void salario () {
		 salario = valorPorHora * horasTrabalhadas;
	}
}

