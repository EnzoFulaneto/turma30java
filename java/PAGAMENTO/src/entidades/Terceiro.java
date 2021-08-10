package entidades;

public class Terceiro extends Funcionario {
	private double adicional;
	private double salario;
	
//construtores
	public Terceiro(String matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}
	
//encapsulamento
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
//metodo
	@Override
	public void salario () {
		 salario = getValorPorHora() * getHorasTrabalhadas() + adicional;
	}
}
