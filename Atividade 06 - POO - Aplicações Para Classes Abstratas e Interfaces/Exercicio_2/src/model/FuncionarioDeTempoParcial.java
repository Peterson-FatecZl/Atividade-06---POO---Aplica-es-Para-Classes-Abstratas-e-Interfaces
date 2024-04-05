package model;

public class FuncionarioDeTempoParcial extends Funcionario {

	private double horaDeEntrada;
	private double horaDeSaida;

	// Construtores
	public FuncionarioDeTempoParcial() {
		super();
	}

	public FuncionarioDeTempoParcial(int id, String nome, double salario, double d, double e) {
		super(id, nome, salario);
		this.horaDeEntrada = d;
		this.horaDeSaida = e;
	}

	// Getters e Setters
	public double getHoraDeEntrada() {
		return horaDeEntrada;
	}

	public void setHoraDeEntrada(double horaDeEntrada) {
		this.horaDeEntrada = horaDeEntrada;
	}

	public double getHoraDeSaida() {
		return horaDeSaida;
	}

	public void setHoraDeSaida(double horaDeSaida) {
		this.horaDeSaida = horaDeSaida;
	}

	@Override
	public String toString() {
		return "FuncionarioDeTempoParcial [horaDeEntrada=" + horaDeEntrada + ", horaDeSaida=" + horaDeSaida
				+ ", getId()=" + getId() + ", getNome()=" + getNome() + ", getSalario()=" + getSalario() + "]";
	}
	
	

}
